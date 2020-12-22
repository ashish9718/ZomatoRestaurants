package com.ashish.zomatorestaurants.models;

public class RatingObj{
    public Title title;
    public BgColor bg_color;

    public RatingObj(Title title, BgColor bg_color) {
        this.title = title;
        this.bg_color = bg_color;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public BgColor getBg_color() {
        return bg_color;
    }

    public void setBg_color(BgColor bg_color) {
        this.bg_color = bg_color;
    }
}