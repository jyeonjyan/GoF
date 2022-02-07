package com.pattern.GoF.flyweight._03_more;

public class Character {
    private char value;
    private String color;
    private Font font;
    private int size;

    public Character(char value, String color, Font font, int size) {
        this.value = value;
        this.color = color;
        this.font = font;
        this.size = size;
    }

    public Font getFont() {
        return font;
    }
}
