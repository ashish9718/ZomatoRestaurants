package com.ashish.zomatorestaurants.models;

public class HasMenuStatus{
    public Object delivery;
    public int takeaway;

    public HasMenuStatus(Object delivery, int takeaway) {
        this.delivery = delivery;
        this.takeaway = takeaway;
    }

    public Object getDelivery() {
        return delivery;
    }

    public void setDelivery(Object delivery) {
        this.delivery = delivery;
    }

    public int getTakeaway() {
        return takeaway;
    }

    public void setTakeaway(int takeaway) {
        this.takeaway = takeaway;
    }
}

