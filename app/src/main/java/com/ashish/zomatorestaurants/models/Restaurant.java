package com.ashish.zomatorestaurants.models;

import java.util.List;

public class Restaurant{
    public Restaurant2 restaurant;

    public Restaurant(Restaurant2 restaurant) {
        this.restaurant = restaurant;
    }

    public Restaurant2 getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant2 restaurant) {
        this.restaurant = restaurant;
    }
}

