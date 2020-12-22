package com.ashish.zomatorestaurants;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.ashish.zomatorestaurants.api.Api;
import com.ashish.zomatorestaurants.databinding.ActivityMainBinding;
import com.ashish.zomatorestaurants.models.Restaurant;
import com.ashish.zomatorestaurants.models.Root;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private CustomAdapter adapter;
    private static final String TAG = "MainActivity";
    private List<Restaurant> restaurantList;
    private Api api;

    private static final String baseurl = "https://developers.zomato.com/";
    private static final String userkey = "1b3c8b37ea96785391fa55c288ac385c";

    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityMainBinding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseurl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        api = retrofit.create(Api.class);

        activityMainBinding.searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                activityMainBinding.tv.setVisibility(View.GONE);
                activityMainBinding.loadingAnim.setVisibility(View.VISIBLE);
                getRestaurantList(query);
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
    }

    public void getRestaurantList(String q){
        Call<Root> call = api.getRoot(userkey,q);
        call.enqueue(new Callback<Root>() {
            @Override
            public void onResponse(Call<Root> call, Response<Root> response) {
                activityMainBinding.loadingAnim.setVisibility(View.INVISIBLE);

                restaurantList = response.body().getRestaurants();

                activityMainBinding.textView.setText(String.valueOf(response.body().results_shown) + " results shown");
                adapter=new CustomAdapter(MainActivity.this,restaurantList);
                activityMainBinding.recyclerview.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                activityMainBinding.recyclerview.setAdapter(adapter);

            }
            @Override
            public void onFailure(Call<Root> call, Throwable t) {
                activityMainBinding.loadingAnim.setVisibility(View.INVISIBLE);
                Toast.makeText(MainActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });
    }

}