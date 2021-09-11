package com.example.franquias.models;

import java.io.Serializable;

public class Franchise implements Serializable {
    private String name;
    private String description;
    private int image;
    private Restaurant[] restaurants;

    public Franchise() {}
    
    public Franchise(String name, String description, int image) {
        this.name = name;
        this.description = description;
        this.image = image;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getImage() {
        return image;
    }
    public void setImage(int image) {
        this.image = image;
    }

    public Restaurant[] getRestaurants() {
        return restaurants;
    }
    public void setRestaurants(Restaurant[] restaurants) {
        this.restaurants = restaurants;
    }



}
