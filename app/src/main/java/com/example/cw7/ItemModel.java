package com.example.cw7;

public class ItemModel {
    private final int image;
    private final String name;
    private final double price;

    public ItemModel(int image, String name, double price) {
        this.image = image;
        this.name = name;
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
