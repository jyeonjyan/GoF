# 어댑터 패턴

## 소개
어탭터 패턴을 가장 잘 설명할 수 있는 예제는 전압의 차이를 맞춰주는 돼지코 어댑터이다.

## 어댑터 패턴 장단점
장점
* 기존 코드를 변경하지 않고 원하는 인터페이스 구현체를 만들어 재사용할 수 있다.
* 기존 코드가 하던 일과 특정 인터페이스 구현체로 변환하는 작업을 각기 다른 클래스로 분리하여 관리할 수 있다.

단점
* 새 클래스가 생겨 복잡도가 증가할 수 있다.
* 경우에 따라서는 기존 코드가 해당 인터페이스를 구현하도록 수정하는 것이 좋은 선택이 될 수도 있다.

## 구현 설명
`security/` 패키지에 있는 것들은 서드파티 라이브러리여서 기존 코드를 변형 시키지 못한다고 한다.   
하지만 무조건 `LoginHandler`의 `login` 메소드를 사용하여 로그인 해야 한다고 한다면..