package com.example.recyclerview;

public class Item {
    private String name;
    private int image;
    private String descripsion;


    public Item(String name, int image, String descripsion) {
        this.name = name;
        this.image = image;
        this.descripsion = descripsion;
    }

    public String getName() {
        return name;
    }

    public String getDescripsion() {
        return descripsion;
    }

    public int getImage() {
        return image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescripsion(String descripsion) {
        this.descripsion = descripsion;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
