package com.pattern.GoF.composite._01_before;

import java.util.ArrayList;
import java.util.List;

public class Bag {
    private final List<Item> itemList = new ArrayList<>();

    public void add(Item item){
        itemList.add(item);
    }

    public List<Item> getItemList() {
        return itemList;
    }
}
