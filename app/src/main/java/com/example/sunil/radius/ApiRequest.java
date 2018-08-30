package com.example.sunil.radius;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiRequest {
    String BASE_URL = "https://my-json-server.typicode.com/iranjith4/ad-assignment/";

    @GET("db")
    Call<ApiResponseData> getData();
}
