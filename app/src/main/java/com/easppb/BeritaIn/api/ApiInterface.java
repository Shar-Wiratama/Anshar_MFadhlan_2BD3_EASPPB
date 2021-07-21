package com.easppb.BeritaIn.api;

import com.easppb.BeritaIn.models.News;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("top-headlines?country=id&apiKey=16cdd3ec81e6436d8ab0d46dbcfabc64")
    Call<News> getNews(

            @Query("country") String country ,
            @Query("apiKey") String apiKey

    );

    @GET("everything")
    Call<News> getNewsSearch(

        @Query("qInTitle") String keyword,
        @Query("language") String language,
        @Query("sortBy") String sortBy,
        @Query("apiKey") String apiKey

    );

}
