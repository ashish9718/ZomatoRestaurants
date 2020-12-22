package com.ashish.zomatorestaurants.models;

public class ZomatoEvent{
    public Event event;

    public ZomatoEvent(Event event) {
        this.event = event;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}
