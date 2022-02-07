package com.pattern.GoF.flyweight._03_more;

public class Client {
    public static void main(String[] args) {
        Character c1 = new Character('c', "white", Font.D2Coding, 12);
        Character c2 = new Character('h', "white", Font.D2Coding, 12);

        System.out.println(Font.D2Coding);
        System.out.println(Font.D2Coding);
    }
}
