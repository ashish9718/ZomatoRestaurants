package com.ashish.zomatorestaurants.models;

public class Photo2{
    public String url;
    public String thumb_url;
    public int order;
    public String md5sum;
    public int id;
    public int photo_id;
    public long uuid;
    public String type;

    public Photo2(String url, String thumb_url, int order, String md5sum, int id, int photo_id, long uuid, String type) {
        this.url = url;
        this.thumb_url = thumb_url;
        this.order = order;
        this.md5sum = md5sum;
        this.id = id;
        this.photo_id = photo_id;
        this.uuid = uuid;
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getThumb_url() {
        return thumb_url;
    }

    public void setThumb_url(String thumb_url) {
        this.thumb_url = thumb_url;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getMd5sum() {
        return md5sum;
    }

    public void setMd5sum(String md5sum) {
        this.md5sum = md5sum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhoto_id() {
        return photo_id;
    }

    public void setPhoto_id(int photo_id) {
        this.photo_id = photo_id;
    }

    public long getUuid() {
        return uuid;
    }

    public void setUuid(long uuid) {
        this.uuid = uuid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
