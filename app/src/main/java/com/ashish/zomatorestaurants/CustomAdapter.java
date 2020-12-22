package com.ashish.zomatorestaurants;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ashish.zomatorestaurants.databinding.ItemRestaurantBinding;
import com.ashish.zomatorestaurants.models.Location;
import com.ashish.zomatorestaurants.models.Photo;
import com.ashish.zomatorestaurants.models.RatingObj;
import com.ashish.zomatorestaurants.models.Restaurant;
import com.ashish.zomatorestaurants.models.Restaurant2;
import com.ashish.zomatorestaurants.models.Title;
import com.ashish.zomatorestaurants.models.UserRating;
import com.squareup.picasso.OkHttpDownloader;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {

    private List<Restaurant> restaurantList;
    private Context context;

    public CustomAdapter(Context context, List<Restaurant> restaurantList) {
        this.context = context;
        this.restaurantList = restaurantList;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ItemRestaurantBinding itemRestaurantBinding = ItemRestaurantBinding.inflate(layoutInflater, parent, false);
        return new CustomViewHolder(itemRestaurantBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        Restaurant2 res = restaurantList.get(position).restaurant;
        Location location = res.location;
        UserRating userRating = res.user_rating;
        Object o = userRating.aggregate_rating;

        holder.itemRestaurantBinding.setRestaurant(res);
        holder.itemRestaurantBinding.setLocation(location);
        holder.itemRestaurantBinding.setO(o);
        holder.itemRestaurantBinding.executePendingBindings();

    }

    @Override
    public int getItemCount() {
        return restaurantList.size();
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {

        ItemRestaurantBinding itemRestaurantBinding;

        public CustomViewHolder(ItemRestaurantBinding itemRestaurantBinding) {
            super(itemRestaurantBinding.getRoot());
            this.itemRestaurantBinding = itemRestaurantBinding;
        }
    }
}