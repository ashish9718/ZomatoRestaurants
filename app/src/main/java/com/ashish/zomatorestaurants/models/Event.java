package com.ashish.zomatorestaurants.models;


import java.util.List;

public class Event{
    public int event_id;
    public String friendly_start_date;
    public String friendly_end_date;
    public String friendly_timing_str;
    public String start_date;
    public String end_date;
    public String end_time;
    public String start_time;
    public int is_active;
    public String date_added;
    public List<Photo> photos;
    public List<Object> restaurants;
    public int is_valid;
    public String share_url;
    public int show_share_url;
    public String title;
    public String description;
    public String display_time;
    public String display_date;
    public int is_end_time_set;
    public String disclaimer;
    public int event_category;
    public String event_category_name;
    public String book_link;
    public List<Object> types;
    public ShareData share_data;

    public Event(int event_id, String friendly_start_date, String friendly_end_date, String friendly_timing_str, String start_date, String end_date, String end_time, String start_time, int is_active, String date_added, List<Photo> photos, List<Object> restaurants, int is_valid, String share_url, int show_share_url, String title, String description, String display_time, String display_date, int is_end_time_set, String disclaimer, int event_category, String event_category_name, String book_link, List<Object> types, ShareData share_data) {
        this.event_id = event_id;
        this.friendly_start_date = friendly_start_date;
        this.friendly_end_date = friendly_end_date;
        this.friendly_timing_str = friendly_timing_str;
        this.start_date = start_date;
        this.end_date = end_date;
        this.end_time = end_time;
        this.start_time = start_time;
        this.is_active = is_active;
        this.date_added = date_added;
        this.photos = photos;
        this.restaurants = restaurants;
        this.is_valid = is_valid;
        this.share_url = share_url;
        this.show_share_url = show_share_url;
        this.title = title;
        this.description = description;
        this.display_time = display_time;
        this.display_date = display_date;
        this.is_end_time_set = is_end_time_set;
        this.disclaimer = disclaimer;
        this.event_category = event_category;
        this.event_category_name = event_category_name;
        this.book_link = book_link;
        this.types = types;
        this.share_data = share_data;
    }

    public int getEvent_id() {
        return event_id;
    }

    public void setEvent_id(int event_id) {
        this.event_id = event_id;
    }

    public String getFriendly_start_date() {
        return friendly_start_date;
    }

    public void setFriendly_start_date(String friendly_start_date) {
        this.friendly_start_date = friendly_start_date;
    }

    public String getFriendly_end_date() {
        return friendly_end_date;
    }

    public void setFriendly_end_date(String friendly_end_date) {
        this.friendly_end_date = friendly_end_date;
    }

    public String getFriendly_timing_str() {
        return friendly_timing_str;
    }

    public void setFriendly_timing_str(String friendly_timing_str) {
        this.friendly_timing_str = friendly_timing_str;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public int getIs_active() {
        return is_active;
    }

    public void setIs_active(int is_active) {
        this.is_active = is_active;
    }

    public String getDate_added() {
        return date_added;
    }

    public void setDate_added(String date_added) {
        this.date_added = date_added;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public List<Object> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(List<Object> restaurants) {
        this.restaurants = restaurants;
    }

    public int getIs_valid() {
        return is_valid;
    }

    public void setIs_valid(int is_valid) {
        this.is_valid = is_valid;
    }

    public String getShare_url() {
        return share_url;
    }

    public void setShare_url(String share_url) {
        this.share_url = share_url;
    }

    public int getShow_share_url() {
        return show_share_url;
    }

    public void setShow_share_url(int show_share_url) {
        this.show_share_url = show_share_url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDisplay_time() {
        return display_time;
    }

    public void setDisplay_time(String display_time) {
        this.display_time = display_time;
    }

    public String getDisplay_date() {
        return display_date;
    }

    public void setDisplay_date(String display_date) {
        this.display_date = display_date;
    }

    public int getIs_end_time_set() {
        return is_end_time_set;
    }

    public void setIs_end_time_set(int is_end_time_set) {
        this.is_end_time_set = is_end_time_set;
    }

    public String getDisclaimer() {
        return disclaimer;
    }

    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
    }

    public int getEvent_category() {
        return event_category;
    }

    public void setEvent_category(int event_category) {
        this.event_category = event_category;
    }

    public String getEvent_category_name() {
        return event_category_name;
    }

    public void setEvent_category_name(String event_category_name) {
        this.event_category_name = event_category_name;
    }

    public String getBook_link() {
        return book_link;
    }

    public void setBook_link(String book_link) {
        this.book_link = book_link;
    }

    public List<Object> getTypes() {
        return types;
    }

    public void setTypes(List<Object> types) {
        this.types = types;
    }

    public ShareData getShare_data() {
        return share_data;
    }

    public void setShare_data(ShareData share_data) {
        this.share_data = share_data;
    }
}
