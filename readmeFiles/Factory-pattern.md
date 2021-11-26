# 팩토리 메소드 (Factory method) 패턴

1. 구체적으로 어떤 인스턴스를 만들지는 서브 클래스가 정한다.
    * 다양한 구현체(Product.interface)가 있고 그중에서 특정한 구현체를 만들 수 있는 다양한 팩토리(Creator.interface)를 제공할 수 있다.
2. OCP, 확장에는 열려있고 변경에는 닫혀있어야 한다.
    * 기존의 문제 상황
    [-> 여기를 참고하세요](../src/main/java/com/pattern/GoF/factory/motivation)