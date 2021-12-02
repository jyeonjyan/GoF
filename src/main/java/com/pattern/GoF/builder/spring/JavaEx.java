package com.pattern.GoF.builder.spring;

import java.util.stream.Stream;

public class JavaEx {
    public static void main(String[] args) {
        /**
         * StringBuilder 사용하기
         */
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello").append(" ").append("World!");

        System.out.println(stringBuilder);

        /**
         * Stream.builder 사용하기
         */
        Stream.Builder<String> builder = Stream.builder();
        Stream<String> stringStream = builder.add("wow").add(" ").add("builder").build();

        stringStream.forEach(System.out::print);
    }
}
