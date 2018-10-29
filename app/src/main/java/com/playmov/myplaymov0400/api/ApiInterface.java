package com.playmov.myplaymov0400.api;

import com.playmov.myplaymov0400.model.Movie;
import retrofit2.Call;
import retrofit2.http.GET;


public interface ApiInterface {

    public static String DB_API="1686a4d5e4ed2c5dd51cf6d3ac65e8b0";

//    @GET("popular?api_key="+DB_API)
//    Call<Dates>getDates();

    @GET("popular?api_key="+DB_API)
    Call<Movie>getPopular();

    @GET("top_rated?api_key="+DB_API)
    Call<Movie>getRated();

}
