package com.pattern.GoF.prototype.example;

import org.springframework.web.util.UriComponentsBuilder;

public class Receipt implements Cloneable{
    private Long id;
    private Client client;
    private MacBook macBook;

    public Receipt(Client client, MacBook macBook) {
        this.client = client;
        this.macBook = macBook;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId(){
        return id;
    }

    /**
     * url 만들기
     * Spring Web 패키지에서 제공하는 UriComponentsBuilder 사용하기
     *
     * @param id
     * @return url
     * @see UriComponentsBuilder
     */
    public String getUri(Long id){
        return UriComponentsBuilder.newInstance()
                .scheme("http")
                .host("www.apple.com")
                .path(id.toString())
                .build().toString();
    }

    public MacBook getMacBook() {
        return macBook;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
