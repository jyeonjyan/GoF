package com.pattern.GoF.composite._02_after;

public class Client {
    public static void main(String[] args) {
        // Item
        Item iPhone = new Item("iPhone", 100);
        Item appleWatch = new Item("appleWatch", 50);

        // Bag
        Bag bag = new Bag();
        bag.add(iPhone);
        bag.add(appleWatch);

        Client client = new Client();
        client.getPrice(iPhone);
        client.getPrice(bag);
    }

    private void getPrice(Component component) {
        System.out.println(component.getPrice());
    }

}
