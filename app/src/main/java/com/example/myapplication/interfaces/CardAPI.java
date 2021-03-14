package com.example.myapplication.interfaces;

import com.example.myapplication.models.Data;

import retrofit2.Call;
import retrofit2.http.GET;


public interface CardAPI {
    //Seccion de la Url a pedir
    @GET("cardinfo.php?name=Tornado%20Dragon&misc=yes")
    public Call<Data> find();

}
