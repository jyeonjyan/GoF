package com.pattern.GoF.flyweight._03_more;

public class CompareIntegerReference {
    public static void main(String[] args) {
        /**
         * ! 이 출력문은 예시일 뿐 실제로 값을 비교할때는 == 이 아닌 .equals()를 사용해야 합니다.
         */
        final Integer cachingTen1 = Integer.valueOf(10);
        final Integer cachingTen2 = Integer.valueOf(10);

        // This method will always cache values in the range -128 to 127, inclusive, and may cache other values outside of this range.
        System.out.println(cachingTen1 == cachingTen2); // true

        final Integer cachingThousand = Integer.valueOf(1000);
        final Integer cachingThousand2 = Integer.valueOf(1000);

        System.out.println(cachingThousand == cachingThousand2); // false
    }
}
