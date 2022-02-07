package com.pattern.GoF.flyweight._02_after;

public final class Font {
    private final String font;
    private final int size;

    public Font(String font, int size) {
        this.font = font;
        this.size = size;
    }

    public String getFont() {
        return font;
    }

    public int getSize() {
        return size;
    }
}
