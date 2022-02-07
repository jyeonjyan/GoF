# Composite pattern 

## Composite 란?
OOP에서 Composite 는 하나 이상의 유사한 객체를 구성으로 설계된 객체로 모두 유사한 기능을 나타낸다.  
그룹을 조작하는 것처럼, 단일 객체를 조작할 수 있다.

예제에서는 Item에 `.getPrice()` Bag에 `.getPrice()`를 유사한 기능으로 두고 Item과 Bag의 `.getPrice()` 내부 구현을 달리 할 수 있다.  

## Composite 패턴이란?
컴포짓 패턴은 클라이언트가 복합 객체나 단일 객체를 동일하게 취급하는 것을 목적으로 한다.  
여기서 컴포짓의 의도는 **트리 구조**로 작성하여 전체-부분 관계를 표현하는 것이다.

트리 구조를 다룰때, 프로그래머는 리프 노드와 브랜치를 구별해야한다.  
여기서 코드는 많은 복잡성을 만들어 에러를 초래한다.  
이를 해결하기 위해 복잡하고 원시적인 객체를 동일하게 취급하기 위한 인터페이스(Component)를 작성할 수 있다.

## Composite pattern 사용하는 곳
복합 객체와 단일 객체의 처리 방법이 다르지 않을 경우, 전체 - 부분 관계로 정의할 수 있다.  
전체-부분 관계는 `Derectory`에 존재한다.  

<p align="center">
    <img src="./material/composite-uml.png" width="800px">
</p>

