# GoF Design Patterns
> Design Patterns: Elements of Reusable Object-Oriented Software

## Task
* [싱글톤패턴](./src/main/java/com/pattern/GoF/singleton)
* 싱글톤 패턴 구현 방법을 깨뜨리는 방법
    * [리플렉션을 통해 싱글톤 패턴을 깨뜨리다](src/test/java/com/pattern/GoF/singleton/crashSingleton/SettingsTest.java)
    * [역직렬화를 통해 싱글톤 패턴을 깨뜨리다](src/test/java/com/pattern/GoF/singleton/crashSingleton/SettingsTest2.java)  
* [싱글톤을 안전하고 단순하게 구현하는 방법](./src/main/java/com/pattern/GoF/singleton/enumType/Settings.java)
    * [enum을 이용한 싱글톤, 리플랙션 조작 차단](./src/test/java/com/pattern/GoF/singleton/enumType/SettingsTest.java)
* [싱글톤 패턴 복습](./readmeFiles/singleton-review.md)
* [팩토리 메소드 패턴](./readmeFiles/Factory-pattern.md)
  * [팩토리 메소드 패턴 적용하기](./src/main/java/com/pattern/GoF/factory/applied)


## Reference
* [백기선 - GoF의 디자인 패턴](https://inf.run/kdrm)