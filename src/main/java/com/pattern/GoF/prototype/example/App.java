package com.pattern.GoF.prototype.example;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        // jyeonjyan 이라는 고객이
        Client client = new Client();
        client.setName("jyeonjyan");

        // Pro 16 을
        MacBook macBook = new MacBook();
        macBook.setSerialNum(1234L);
        macBook.setModelName("Pro 16");

        // 구매한다.
        Receipt receipt = new Receipt(client, macBook);
        receipt.setId(1L);

        // 영수증 url 을 발급한다.
        String url = receipt.getUri(receipt.getId());
        System.out.println(url);

        // Object 의 clone 메서드는 얕은 복사를 지원한다.
        Receipt clone = (Receipt) receipt.clone();
        System.out.println(clone.getUri(1L));
        System.out.println(receipt.getMacBook().getSerialNum() == clone.getMacBook().getSerialNum());
    }
}
