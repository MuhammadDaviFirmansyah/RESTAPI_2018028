package com.example.restapi;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;

public interface Api {
    String BASE_URL = "https://dev.farizdotid.com/";
    @GET("api/daerahindonesia/provinsi")
    Call<ProvinceItem> getDigimons();
}
