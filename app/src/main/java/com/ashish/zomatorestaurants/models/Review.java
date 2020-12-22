package com.ashish.zomatorestaurants.models;

import java.util.List;

public class Review{
    public List<Object> review;

    public Review(List<Object> review) {
        this.review = review;
    }

    public List<Object> getReview() {
        return review;
    }

    public void setReview(List<Object> review) {
        this.review = review;
    }
}