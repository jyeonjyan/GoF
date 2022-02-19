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