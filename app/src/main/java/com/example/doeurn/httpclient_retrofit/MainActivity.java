package com.example.doeurn.httpclient_retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;

import com.example.doeurn.httpclient_retrofit.entity.Category;
import com.example.doeurn.httpclient_retrofit.entity.response.ACategoryResponse;
import com.example.doeurn.httpclient_retrofit.entity.response.CategoryForm;
import com.example.doeurn.httpclient_retrofit.entity.response.CategoryResponse;
import com.example.doeurn.httpclient_retrofit.repository.KnongdaiService;
import com.example.doeurn.httpclient_retrofit.repository.network.ServiceGenerator;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    KnongdaiService.CategoryService categoryService;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createServices();
        progressBar=findViewById(R.id.progressBar);
        progressBar.setVisibility(ProgressBar.GONE);
    }

    private void createServices() {
        categoryService= ServiceGenerator.createService(KnongdaiService.CategoryService.class);
    }

    public void onGetCategories(View view) {
        getCategories();
    }

    private void getCategories() {
        Call<CategoryResponse> call=categoryService.getCategories();
        call.enqueue(new Callback<CategoryResponse>() {
            @Override
            public void onResponse(Call<CategoryResponse> call, Response<CategoryResponse> response) {

                try{
                    CategoryResponse categoryResponse= response.body();
                    List<Category> categories=categoryResponse.getCategories();

                    Log.e("category-> ",categories.get(0).toString());

                }catch (Exception e){
                    e.printStackTrace();
                }


            }

            @Override
            public void onFailure(Call<CategoryResponse> call, Throwable t) {
                Log.e("error-> ", t.toString());
            }
        });

    }

    public void onGetCategory(View view){

        getCategory(1);
    }

    private void getCategory(int i) {
        Call<ACategoryResponse> call=categoryService.getCategory(i);
        call.enqueue(new Callback<ACategoryResponse>() {
            @Override
            public void onResponse(Call<ACategoryResponse> call, Response<ACategoryResponse> response) {

                try{
                    Log.e("category by id->", response.body().getData().toString());
                }catch (Exception e){
                    e.printStackTrace();
                }

            }

            @Override
            public void onFailure(Call<ACategoryResponse> call, Throwable t) {

            }
        });

    }

    public void onCreateCategory(View view) {
        CategoryForm categoryForm=new CategoryForm();
        categoryForm.setCate_name("LLLLL");
        categoryForm.setDes("LLLLLLLLLLL");
        List<String> keyword=new ArrayList<>();
        keyword.add("lll");
        keyword.add("ll");
        createCategory(categoryForm);
    }

    private void createCategory(CategoryForm categoryForm) {
        progressBar.setVisibility(ProgressBar.VISIBLE);
        Call<ACategoryResponse> call=categoryService.createCategory(categoryForm);
        call.enqueue(new Callback<ACategoryResponse>() {
            @Override
            public void onResponse(Call<ACategoryResponse> call, Response<ACategoryResponse> response) {

                try{
                    Log.e("smg-> ", response.body().getMsg());
                }catch (Exception e){
                    e.printStackTrace();
                }
                progressBar.setVisibility(ProgressBar.GONE);

            }

            @Override
            public void onFailure(Call<ACategoryResponse> call, Throwable t) {

            }
        });
    }
}
