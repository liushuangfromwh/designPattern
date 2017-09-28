package com.ls.demo1;

/**
 * @author liushuang 2017/9/28
 */
public class Product {

    private String name;
    private String price;

    public void show() {
        System.out.println("name :" + name);
        System.out.println("price :" + price);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
