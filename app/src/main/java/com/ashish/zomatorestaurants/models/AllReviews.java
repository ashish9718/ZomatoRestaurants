package com.ashish.zomatorestaurants.models;

import java.util.List;

public class AllReviews{
    public List<Review> reviews;

    public AllReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
}


