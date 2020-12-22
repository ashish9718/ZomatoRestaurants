package com.ashish.zomatorestaurants.models;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import java.util.List;

public class Restaurant2 {
    public R r;
    public String apikey;
    public String id;
    public String name;
    public String url;
    public Location location;
    public int switch_to_order_menu;
    public String cuisines;
    public String timings;
    public int average_cost_for_two;
    public int price_range;
    public String currency;
    public List<String> highlights;
    public List<Object> offers;
    public int opentable_support;
    public int is_zomato_book_res;
    public String mezzo_provider;
    public int is_book_form_web_view;
    public String book_form_web_view_url;
    public String book_again_url;
    public String thumb;
    public UserRating user_rating;
    public int all_reviews_count;
    public String photos_url;
    public int photo_count;
    public String menu_url;
    public String featured_image;
    public Object medio_provider;
    public int has_online_delivery;
    public int is_delivering_now;
    public String store_type;
    public boolean include_bogo_offers;
    public String deeplink;
    public String order_url;
    public String order_deeplink;
    public int is_table_reservation_supported;
    public int has_table_booking;
    public String events_url;
    public String phone_numbers;
    public AllReviews all_reviews;
    public List<String> establishment;
    public List<Object> establishment_types;
    public List<ZomatoEvent> zomato_events;
    public String book_url;

    public Restaurant2(R r, String apikey, String id, String name, String url, Location location, int switch_to_order_menu, String cuisines, String timings, int average_cost_for_two, int price_range, String currency, List<String> highlights, List<Object> offers, int opentable_support, int is_zomato_book_res, String mezzo_provider, int is_book_form_web_view, String book_form_web_view_url, String book_again_url, String thumb, UserRating user_rating, int all_reviews_count, String photos_url, int photo_count, String menu_url, String featured_image, Object medio_provider, int has_online_delivery, int is_delivering_now, String store_type, boolean include_bogo_offers, String deeplink, String order_url, String order_deeplink, int is_table_reservation_supported, int has_table_booking, String events_url, String phone_numbers, AllReviews all_reviews, List<String> establishment, List<Object> establishment_types, List<ZomatoEvent> zomato_events, String book_url) {
        this.r = r;
        this.apikey = apikey;
        this.id = id;
        this.name = name;
        this.url = url;
        this.location = location;
        this.switch_to_order_menu = switch_to_order_menu;
        this.cuisines = cuisines;
        this.timings = timings;
        this.average_cost_for_two = average_cost_for_two;
        this.price_range = price_range;
        this.currency = currency;
        this.highlights = highlights;
        this.offers = offers;
        this.opentable_support = opentable_support;
        this.is_zomato_book_res = is_zomato_book_res;
        this.mezzo_provider = mezzo_provider;
        this.is_book_form_web_view = is_book_form_web_view;
        this.book_form_web_view_url = book_form_web_view_url;
        this.book_again_url = book_again_url;
        this.thumb = thumb;
        this.user_rating = user_rating;
        this.all_reviews_count = all_reviews_count;
        this.photos_url = photos_url;
        this.photo_count = photo_count;
        this.menu_url = menu_url;
        this.featured_image = featured_image;
        this.medio_provider = medio_provider;
        this.has_online_delivery = has_online_delivery;
        this.is_delivering_now = is_delivering_now;
        this.store_type = store_type;
        this.include_bogo_offers = include_bogo_offers;
        this.deeplink = deeplink;
        this.order_url = order_url;
        this.order_deeplink = order_deeplink;
        this.is_table_reservation_supported = is_table_reservation_supported;
        this.has_table_booking = has_table_booking;
        this.events_url = events_url;
        this.phone_numbers = phone_numbers;
        this.all_reviews = all_reviews;
        this.establishment = establishment;
        this.establishment_types = establishment_types;
        this.zomato_events = zomato_events;
        this.book_url = book_url;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public String getApikey() {
        return apikey;
    }

    public void setApikey(String apikey) {
        this.apikey = apikey;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getSwitch_to_order_menu() {
        return switch_to_order_menu;
    }

    public void setSwitch_to_order_menu(int switch_to_order_menu) {
        this.switch_to_order_menu = switch_to_order_menu;
    }

    public String getCuisines() {
        return cuisines;
    }

    public void setCuisines(String cuisines) {
        this.cuisines = cuisines;
    }

    public String getTimings() {
        return timings;
    }

    public void setTimings(String timings) {
        this.timings = timings;
    }

    public int getAverage_cost_for_two() {
        return average_cost_for_two;
    }

    public void setAverage_cost_for_two(int average_cost_for_two) {
        this.average_cost_for_two = average_cost_for_two;
    }

    public int getPrice_range() {
        return price_range;
    }

    public void setPrice_range(int price_range) {
        this.price_range = price_range;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public List<String> getHighlights() {
        return highlights;
    }

    public void setHighlights(List<String> highlights) {
        this.highlights = highlights;
    }

    public List<Object> getOffers() {
        return offers;
    }

    public void setOffers(List<Object> offers) {
        this.offers = offers;
    }

    public int getOpentable_support() {
        return opentable_support;
    }

    public void setOpentable_support(int opentable_support) {
        this.opentable_support = opentable_support;
    }

    public int getIs_zomato_book_res() {
        return is_zomato_book_res;
    }

    public void setIs_zomato_book_res(int is_zomato_book_res) {
        this.is_zomato_book_res = is_zomato_book_res;
    }

    public String getMezzo_provider() {
        return mezzo_provider;
    }

    public void setMezzo_provider(String mezzo_provider) {
        this.mezzo_provider = mezzo_provider;
    }

    public int getIs_book_form_web_view() {
        return is_book_form_web_view;
    }

    public void setIs_book_form_web_view(int is_book_form_web_view) {
        this.is_book_form_web_view = is_book_form_web_view;
    }

    public String getBook_form_web_view_url() {
        return book_form_web_view_url;
    }

    public void setBook_form_web_view_url(String book_form_web_view_url) {
        this.book_form_web_view_url = book_form_web_view_url;
    }

    public String getBook_again_url() {
        return book_again_url;
    }

    public void setBook_again_url(String book_again_url) {
        this.book_again_url = book_again_url;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public UserRating getUser_rating() {
        return user_rating;
    }

    public void setUser_rating(UserRating user_rating) {
        this.user_rating = user_rating;
    }

    public int getAll_reviews_count() {
        return all_reviews_count;
    }

    public void setAll_reviews_count(int all_reviews_count) {
        this.all_reviews_count = all_reviews_count;
    }

    public String getPhotos_url() {
        return photos_url;
    }

    public void setPhotos_url(String photos_url) {
        this.photos_url = photos_url;
    }

    public int getPhoto_count() {
        return photo_count;
    }

    public void setPhoto_count(int photo_count) {
        this.photo_count = photo_count;
    }

    public String getMenu_url() {
        return menu_url;
    }

    public void setMenu_url(String menu_url) {
        this.menu_url = menu_url;
    }

    public String getFeatured_image() {
        return featured_image;
    }

    public void setFeatured_image(String featured_image) {
        this.featured_image = featured_image;
    }

    public Object getMedio_provider() {
        return medio_provider;
    }

    public void setMedio_provider(Object medio_provider) {
        this.medio_provider = medio_provider;
    }

    public int getHas_online_delivery() {
        return has_online_delivery;
    }

    public void setHas_online_delivery(int has_online_delivery) {
        this.has_online_delivery = has_online_delivery;
    }

    public int getIs_delivering_now() {
        return is_delivering_now;
    }

    public void setIs_delivering_now(int is_delivering_now) {
        this.is_delivering_now = is_delivering_now;
    }

    public String getStore_type() {
        return store_type;
    }

    public void setStore_type(String store_type) {
        this.store_type = store_type;
    }

    public boolean isInclude_bogo_offers() {
        return include_bogo_offers;
    }

    public void setInclude_bogo_offers(boolean include_bogo_offers) {
        this.include_bogo_offers = include_bogo_offers;
    }

    public String getDeeplink() {
        return deeplink;
    }

    public void setDeeplink(String deeplink) {
        this.deeplink = deeplink;
    }

    public String getOrder_url() {
        return order_url;
    }

    public void setOrder_url(String order_url) {
        this.order_url = order_url;
    }

    public String getOrder_deeplink() {
        return order_deeplink;
    }

    public void setOrder_deeplink(String order_deeplink) {
        this.order_deeplink = order_deeplink;
    }

    public int getIs_table_reservation_supported() {
        return is_table_reservation_supported;
    }

    public void setIs_table_reservation_supported(int is_table_reservation_supported) {
        this.is_table_reservation_supported = is_table_reservation_supported;
    }

    public int getHas_table_booking() {
        return has_table_booking;
    }

    public void setHas_table_booking(int has_table_booking) {
        this.has_table_booking = has_table_booking;
    }

    public String getEvents_url() {
        return events_url;
    }

    public void setEvents_url(String events_url) {
        this.events_url = events_url;
    }

    public String getPhone_numbers() {
        return phone_numbers;
    }

    public void setPhone_numbers(String phone_numbers) {
        this.phone_numbers = phone_numbers;
    }

    public AllReviews getAll_reviews() {
        return all_reviews;
    }

    public void setAll_reviews(AllReviews all_reviews) {
        this.all_reviews = all_reviews;
    }

    public List<String> getEstablishment() {
        return establishment;
    }

    public void setEstablishment(List<String> establishment) {
        this.establishment = establishment;
    }

    public List<Object> getEstablishment_types() {
        return establishment_types;
    }

    public void setEstablishment_types(List<Object> establishment_types) {
        this.establishment_types = establishment_types;
    }

    public List<ZomatoEvent> getZomato_events() {
        return zomato_events;
    }

    public void setZomato_events(List<ZomatoEvent> zomato_events) {
        this.zomato_events = zomato_events;
    }

    public String getBook_url() {
        return book_url;
    }

    public void setBook_url(String book_url) {
        this.book_url = book_url;
    }

    @BindingAdapter("android:loadImage")
    public static void loadImage(ImageView imageView,String imageurl){
        if(!imageurl.equals("")){
            Glide.with(imageView).load(imageurl).into(imageView);
        }else {
            Glide.with(imageView).load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRCfj2cq6upd3FjyNV01elip8KIH4ek6B39lg&usqp=CAU").into(imageView);
        }
    }
}

