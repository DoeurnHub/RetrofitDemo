package com.example.doeurn.httpclient_retrofit.repository.network;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Doeurn on 11/29/17.
 */

public class ServiceGenerator {

    private static final String BASE_URL="http://110.74.194.125:15000/";
    private static OkHttpClient.Builder client=new OkHttpClient.Builder();

    private static Retrofit.Builder builder=new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create());

    public static <S> S createService(Class<S> service){

        Retrofit retrofit= builder
                .client(client.build())
                .build();

       return retrofit.create(service);
    }

}
