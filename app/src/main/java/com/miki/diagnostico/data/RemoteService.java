package com.miki.diagnostico.data;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RemoteService {

    private Retrofit retrofit;

    public RemoteService() {
        retrofit = new Retrofit.Builder().baseUrl("https://api-diagnostico-covid19.herokuapp.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(interceptor())
                .build();
    }

    public Retrofit getRetrofit() {
        return retrofit;
    }

    private OkHttpClient interceptor() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(logging)
                .build();
        return client;
    }
}
