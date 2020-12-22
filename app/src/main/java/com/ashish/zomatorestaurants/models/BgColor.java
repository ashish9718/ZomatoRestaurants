package com.ashish.zomatorestaurants.models;


public class BgColor{
    public String type;
    public String tint;

    public BgColor(String type, String tint) {
        this.type = type;
        this.tint = tint;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTint() {
        return tint;
    }

    public void setTint(String tint) {
        this.tint = tint;
    }
}
