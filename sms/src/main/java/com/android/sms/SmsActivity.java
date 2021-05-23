package com.android.sms;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.android.common.LogUtil;

@Route(path = "/sms/SmsActivity")
public class SmsActivity extends AppCompatActivity {
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);
        LogUtil.d(this.getPackageName(), "WeatherActivity > onCreate()");

        mButton = findViewById(R.id.goWeather);
        mButton.setOnClickListener(v -> {
            ARouter.getInstance()
                    .build("/weather/WeatherActivity")
                    .withString("key1", "我是信息").navigation();
        });
    }
}