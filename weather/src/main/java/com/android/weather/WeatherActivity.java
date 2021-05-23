package com.android.weather;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.android.common.LogUtil;

@Route(path = "/weather/WeatherActivity")
public class WeatherActivity extends AppCompatActivity {
    final static String TAG_TEST = "WeatherActivityTest";

    @Autowired(name = "key1")
    String key1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        LogUtil.d(this.getPackageName(), "WeatherActivity > onCreate()");

        ARouter.getInstance().inject(this);
        LogUtil.d(TAG_TEST, this.getPackageName() + "接收的信息： " + key1);

    }

}