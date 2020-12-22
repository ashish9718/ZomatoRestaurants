package com.ashish.zomatorestaurants.models;

public class UserRating{
    public Object aggregate_rating;
    public String rating_text;
    public String rating_color;
    public RatingObj rating_obj;
    public int votes;
    public String custom_rating_text;
    public String custom_rating_text_background;
    public String rating_tool_tip;

    public UserRating(Object aggregate_rating, String rating_text, String rating_color, RatingObj rating_obj, int votes, String custom_rating_text, String custom_rating_text_background, String rating_tool_tip) {
        this.aggregate_rating = aggregate_rating;
        this.rating_text = rating_text;
        this.rating_color = rating_color;
        this.rating_obj = rating_obj;
        this.votes = votes;
        this.custom_rating_text = custom_rating_text;
        this.custom_rating_text_background = custom_rating_text_background;
        this.rating_tool_tip = rating_tool_tip;
    }

    public Object getAggregate_rating() {
        return aggregate_rating;
    }

    public void setAggregate_rating(Object aggregate_rating) {
        this.aggregate_rating = aggregate_rating;
    }

    public String getRating_text() {
        return rating_text;
    }

    public void setRating_text(String rating_text) {
        this.rating_text = rating_text;
    }

    public String getRating_color() {
        return rating_color;
    }

    public void setRating_color(String rating_color) {
        this.rating_color = rating_color;
    }

    public RatingObj getRating_obj() {
        return rating_obj;
    }

    public void setRating_obj(RatingObj rating_obj) {
        this.rating_obj = rating_obj;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public String getCustom_rating_text() {
        return custom_rating_text;
    }

    public void setCustom_rating_text(String custom_rating_text) {
        this.custom_rating_text = custom_rating_text;
    }

    public String getCustom_rating_text_background() {
        return custom_rating_text_background;
    }

    public void setCustom_rating_text_background(String custom_rating_text_background) {
        this.custom_rating_text_background = custom_rating_text_background;
    }

    public String getRating_tool_tip() {
        return rating_tool_tip;
    }

    public void setRating_tool_tip(String rating_tool_tip) {
        this.rating_tool_tip = rating_tool_tip;
    }
}





