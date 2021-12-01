# GoF Design Patterns
> Design Patterns: Elements of Reusable Object-Oriented Software

## Task
### [싱글톤패턴](./src/main/java/com/pattern/GoF/singleton)
* 싱글톤 패턴 구현 방법을 깨뜨리는 방법
    * [리플렉션을 통해 싱글톤 패턴을 깨뜨리다](src/test/java/com/pattern/GoF/singleton/crashSingleton/SettingsTest.java)
    * [역직렬화를 통해 싱글톤 패턴을 깨뜨리다](src/test/java/com/pattern/GoF/singleton/crashSingleton/SettingsTest2.java)  
* [싱글톤을 안전하고 단순하게 구현하는 방법](./src/main/java/com/pattern/GoF/singleton/enumType/Settings.java)
    * [enum을 이용한 싱글톤, 리플랙션 조작 차단](./src/test/java/com/pattern/GoF/singleton/enumType/SettingsTest.java)
* [싱글톤 패턴 복습](./readmeFiles/singleton-review.md)

### [팩토리 메소드 패턴](./readmeFiles/Factory-pattern.md)
* [팩토리 메소드 패턴 적용하기](./src/main/java/com/pattern/GoF/factory/applied)
* [팩토리 메소드 패턴 복습](./readmeFiles/factory-pattern-review.md)
* [spring 찾아보는 팩토리 메소드 패턴](./src/main/java/com/pattern/GoF/factory/spring)

### [추상 팩토리 패턴](./readmeFiles/abstract-factory-pattern.md)
* 추상 팩토리 패턴 구현하기
* 추상 팩토리 패턴의 장점과 단점

### 빌더 패턴
* [빌더 패턴을 사용해야 하는 이유](./src/main/java/com/pattern/GoF/builder/motivation)
* [빌더 패턴 적용하기](./src/main/java/com/pattern/GoF/builder/pattern)
* [빌더 패턴 장점과 단점 -> 내 TIL을 참고해주면 좋겠다.](https://github.com/jyeonjyan/TIL/blob/master/Lecture/JAVA/builder-pattern.md)
* [자바와 스프링에서 사용하는 빌더 패턴]()

## Reference
* [백기선 - GoF의 디자인 패턴](https://inf.run/kdrm)

## Notes
* 해당 GoF 레포지터리는 Java 기반으로 작성되었습니다.
* springboot package 구조 때문에 [octotree](https://www.octotree.io/) 사용을 권장합니다.
* 현재는 구현에 집중되어 있지만, 추후 개념적인 부분도 업로드 할 예정입니다.
* 잘못된 개념이나 오타는 issue 작성 부탁드립니다 🙇🏻‍♂️
