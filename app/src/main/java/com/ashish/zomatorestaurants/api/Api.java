package com.ashish.zomatorestaurants.api;

import com.ashish.zomatorestaurants.models.Restaurant;
import com.ashish.zomatorestaurants.models.Root;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface Api {

    //https://developers.zomato.com/api/v2.1/search?q=ghaziabad
    @GET("api/v2.1/search")
    Call<Root> getRoot(@Header("user-key") String userkey , @Query("q") String location);

}
