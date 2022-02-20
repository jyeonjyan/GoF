# 전략 패턴 (strategy pattern)
> 전략을 쉽게 바꿀 수 있도록 해주는 패턴이다.

## 다이어그램

<p align="center">
    <img src="./material/strategy-pattern-diagram.png" width="800px">
</p>

다이어그램은 위에 그림과 같다. 추가적인 설명을 하자면..
1. `Class1`, `Class2` 처럼 실제로 전략을 사용하는 사용부에서는 `Context`를 사용하고 `Context`를 생성할 때 원하는 전략을 넣어 생성한다.
    * `new Context(Strategy s);`

2. `Strategy`는 외부에서 동일한 방식으로 호출할 수 있는 메소드를 정의한다. (Concrete Strategy 에서 Strategy 메소드를 구현한다.)

## 예시
> 전략패턴을 이용하여 간편하게 ResponseEntity와 spring hateoas RestAPI 구성을 사용하는 방법을 소개한다.


들어가기 전에..  
* 실무에서 RestAPI를 만족하기 위해 ResponseEntity + spring-hateoas 구성을 선호하는지는 확실하지 않다.  
* 완성도 높은 로직은 아니다. 그저 전략 패턴의 이해를 위한 예시이다.

우리팀에서는 보통 크게 `singleResult`와 `listResult`에 대응하여 responseService를 만든다.

## SingleResult

우리가 정형화 하고자 하는 singleResult responseBody는 아래와 같다.

```json
{
  "id": 1,
  "email": "string@gsm",
  "username": "2",
  "_links": {
    "self": {
      "href": "http://localhost:8080/demo/v0.0.1/user/2"
    }
  }
}
```

위의 responseBody를 참고하면 responseDto의 내용 + RestAPI의 필수 요소 hateoas가 적용된 것을 알 수 있다.  
여기는 RestAPI에 대한 내용이 아니기 때문에 `responseBody`가 이렇다만 설명하고 넘어가겠다.

### UserInfoController/createUserInfo()  
원하는 singleResult를 반환하기 위해서는 아래와 같은 로직을 거쳐야 한다.

```java
@PostMapping("/userinfo")
public ResponseEntity<UserInfoDto.UserInfoResponseDto> createUserInfo(@RequestBody UserInfoDto.UserInfoRequestDto requestDto){
    final UserInfoDto.UserInfoResponseDto userInfo = userInfoService.createUserInfo(requestDto);

    /*
    hateoas:: "_links": "self": "href"
        */
    userInfo.add(
            Link.of(String.valueOf(linkTo(UserInfoController.class)
                    .slash(userInfo.getId()).toUri()))
                    .withSelfRel()
    );

    return ResponseEntity
            .created(linkTo(UserInfoController.class)
            .slash(userInfo.getId()).toUri())
            .body(userInfo);
}
```

* userInfo 인스턴스에 hateoas link를 추가해주고
* 그 userInfo를 responseEntity를 만들 때 body에 실어 리턴한다.

## 이 두 과정을 한번에 처리해주는 방법이 없을까?

1. Context 에 해당하는 `ResponseService`를 만든다.
   1. `ResponseService`는 Strategy에 해당하는 `ResponseStrategy`를 갖는다.
2. Strategy에 해당하는 `ResponseStrategy` 에는 `ConcreteStrategy` 클래스에서 구현할 메소드를 정의한다.
3. 각 `ConcreteStrategy` 에서 `ResponseStrategy` 메소드를 구현한다.

ResponseService.java [Context class]
```java
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 * 적절한 ResponseEntity 를 만들기 위한 Template 클래스
 */
@Service
public class ResponseService {

    /*
        response를 생성하는 method
    */
    public ResponseEntity<Object> createResponse(ResponseStrategy responseStrategy, Object data){
        return responseStrategy.createResponse(data);
    }
}
```

ResponseStrategy.java [Strategy interface]
```java
import org.springframework.http.ResponseEntity;

public interface ResponseStrategy {
    ResponseEntity<Object> createResponse(Object createdId);
}
```

SingleResultStrategy.java [ConcreteStrategy class]
```java
import org.springframework.hateoas.Link;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.http.ResponseEntity;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

public class SingleResultStrategy<C, M extends RepresentationModel <? extends M>> implements ResponseStrategy{

    private final C targetController;
    private final M targetModel;

    public SingleResultStrategy(C targetController, M targetModel) {
        this.targetController = targetController;
        this.targetModel = targetModel;
    }

    @Override
    public ResponseEntity<Object> createResponse(Object data) {

        final Object bodyContent = targetModel
                .add(Link.of(String.valueOf(linkTo(targetController.getClass())
                        .slash(data).toUri()))
                        .withSelfRel());

        return ResponseEntity.ok().body(bodyContent);
    }
}
```

## 장점과 단점

### 장점
* 새로운 전략을 추가하더라도 기존 코드를 변경하지 않는다 (OCP)
* 상속 대신 위임을 사용할 수 있다 (interface - class)
* 런타임에 전략을 변경할 수 있다 (`setterMethod(Strategy st)`)

### 단점
* 복잡도가 증가한다.
* 클라이언트 코드가 구체적인 전략을 알아야 한다.
  * 전략패턴을 통한 `ResponseService` 개선하기 예시에서 야기된 문제이다.
* 패턴 특성상 재사용성을 챙기가 어렵다.