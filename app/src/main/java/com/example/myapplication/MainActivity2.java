package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.interfaces.CardAPI;
import com.example.myapplication.models.Cards;
import com.example.myapplication.models.Data;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.time.LocalDate;
import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity2 extends AppCompatActivity {
    private Button btnApi;
    private TextView mostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mostrar = findViewById(R.id.mostrar_tv);
        btnApi = findViewById(R.id.llamadaApi);

        btnApi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                find();
            }
        });
    }




    private void find() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://db.ygoprodeck.com/api/v7/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        CardAPI cardAPI = retrofit.create(CardAPI.class);
        Call<Cards> call = cardAPI.find();
        call.enqueue(new Callback<Cards>() {
            @Override
            public void onResponse(Call<Cards> call, Response<Cards> response) {
            try {
                if (response.isSuccessful()){
                    Log.e("response", "200OK");
                    Log.e("response", "200OK");
                    }
                } catch (Exception e){
                Log.e("ERROR", "400err");
            }
            }

            @Override
            public void onFailure(Call<Cards> call, Throwable t) {
                Log.e("response", "400err");
            }
        });
        }
}