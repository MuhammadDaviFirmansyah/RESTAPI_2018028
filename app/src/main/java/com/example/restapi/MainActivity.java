package com.example.restapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ListView DigimonListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DigimonListView = findViewById(R.id.DigimonListView);

        getDigimons();
    }

    private void getDigimons() {
        Call<ProvinceItem> call = RetrofitClient.getInstance().getMyApi().getDigimons();
        call.enqueue(new Callback<ProvinceItem>() {
            @Override
            public void onResponse(Call<ProvinceItem> call, Response<ProvinceItem> response) {
                ProvinceItem DigimonData = response.body();
                ArrayList<ProvinsiItem> data = DigimonData.getProvinsi();
                String[] digimon = new String[data.size()];

                for (int i = 0; i < data.size(); i++) {
                    digimon[i] = data.get(i).getNama();
                }

                DigimonListView.setAdapter(new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, digimon));
            }

            @Override
            public void onFailure(Call<ProvinceItem> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.toString(), Toast.LENGTH_LONG).show();
            }

        });
    }
}