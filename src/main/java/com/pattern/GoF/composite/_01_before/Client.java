package com.pattern.GoF.composite._01_before;

public class Client {
    public static void main(String[] args) {
        Item iPhone = new Item("iPhone", 100);
        Item appleWatch = new Item("appleWatch", 50);

        Bag bag = new Bag();
        bag.add(iPhone);
        bag.add(appleWatch);

        Client client = new Client();
        client.printPrice(iPhone);
        client.printPrice(bag);
    }

    private void printPrice(Bag bag) {
        final Integer result = bag.getItemList()
                            .stream()
                            .map(Item::getPrice)
                            .reduce(Integer::sum)
                            .orElse(0);

        System.out.println("result = " + result);
    }

    private void printPrice(Item ite) {
        System.out.println(ite.getPrice());
    }
}
