package com.zomato.model;


public class MenuItems {
    private String code;
    private String name;
    private int price;

    public MenuItems(String code, String name, int price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String c) {
        code = c;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int p) {
        price = p;
    }
}