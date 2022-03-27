package com.company;

public class Product {
    @Override
    public String toString() {
        return "Product{" +
                "color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public Product(String color, int price) {
        setPrice(price);
        setColor(color);
    }

    public String getColor() {
        return color;
    }

    private void setColor(String color) {
        this.color = color;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    private String color;
    private Integer price;

}

