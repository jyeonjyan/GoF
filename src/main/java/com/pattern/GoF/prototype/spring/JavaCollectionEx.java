package com.pattern.GoF.prototype.spring;

import java.util.ArrayList;
import java.util.List;

public class JavaCollectionEx {
    public static void main(String[] args) {
        Student jihwan = new Student("jihwan");
        Student siwony = new Student("siwony");

//        ArrayList<Student> studentArrayList = new ArrayList<>();
        /**
         * 보통 ArrayList 로 구체적인 타입을 사용하지 않는다.
         * 추상적인 List 타입을 사용한다. (구현체에 유연함).
         */
        List<Student> studentArrayList = new ArrayList<>();

        studentArrayList.add(jihwan);
        studentArrayList.add(siwony);

        List<Student> cloneList = new ArrayList<>(studentArrayList);
        System.out.println(studentArrayList.equals(cloneList));
    }
}
