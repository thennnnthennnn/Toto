package com.p.Model;

public class Good {
    private int id;
    private String name;
    private int inventory;
    private int price;
    private String category;
    public int getId(){
        return id;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Good{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", inventory=" + inventory +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }

    public int getInventory() {
        return inventory;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
