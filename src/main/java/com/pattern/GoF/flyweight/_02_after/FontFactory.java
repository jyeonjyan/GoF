package com.pattern.GoF.flyweight._02_after;

import java.util.HashMap;
import java.util.Map;

public class FontFactory {
    private Map<String, Font> cache = new HashMap<>();

    public Font getFont(String font){
        if (cache.containsKey(font)){
            return cache.get(font);
        } else {
            String[] split = font.split(":");
            Font newFont = new Font(split[0], Integer.getInteger(split[1]));
            cache.put(font, newFont);

            return newFont;
        }
    }
}
