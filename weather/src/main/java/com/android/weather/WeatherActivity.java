package com.android.weather;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.android.common.LogUtil;

@Route(path = "/weather/WeatherActivity")
public class WeatherActivity extends AppCompatActivity {
    final static String TAG_TEST="WeatherActivityTest";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        LogUtil.d(this.getPackageName(), "WeatherActivity > onCreate()");

        String key1=getIntent().getStringExtra("key1");
        LogUtil.d(TAG_TEST,key1);
    }

}