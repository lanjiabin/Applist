package com.android.weather;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.android.common.LogUtil;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        LogUtil.d(this.getPackageName(), "WeatherActivity > onCreate()");
    }
}