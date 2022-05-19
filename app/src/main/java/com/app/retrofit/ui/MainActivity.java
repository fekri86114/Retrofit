package com.app.retrofit.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.app.retrofit.R;
import com.app.retrofit.databinding.ActivityMainBinding;
import com.app.retrofit.ui.adapter.CityNameAdapter;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private CityNameAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        adapter = new CityNameAdapter();
        binding.recyclerCityName.setHasFixedSize(true);
        binding.recyclerCityName.setAdapter(adapter);


    }



}