package com.example.doeurn.httpclient_retrofit.repository;

import com.example.doeurn.httpclient_retrofit.entity.Category;
import com.example.doeurn.httpclient_retrofit.entity.response.ACategoryResponse;
import com.example.doeurn.httpclient_retrofit.entity.response.CategoryForm;
import com.example.doeurn.httpclient_retrofit.entity.response.CategoryResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Doeurn on 11/29/17.
 */

public interface KnongdaiService {

    interface CategoryService{

        @GET("api/v1/categories")
        Call<CategoryResponse> getCategories();

        @GET("/api/v1/categories/{id}")
        Call<ACategoryResponse> getCategory(@Path("id") int id);

        @POST("/api/v1/categories/create-main")
        Call<ACategoryResponse> createCategory(@Body CategoryForm categoryForm);



    }
}
