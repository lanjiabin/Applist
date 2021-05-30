package com.android.home;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.launcher.ARouter;
import com.android.common.LogUtil;
import com.android.common.sms.api.ISmsService;
import com.android.common.sms.api.SmsRouterTable;

import java.util.List;

public class HomeActivity extends AppCompatActivity {
    Button mGoWeatherBtn;
    Button mGetMsgBtn;
    Button mSentMsgBtn;
    static final String TAG = "HomeActivityTest";
    @Autowired(name = SmsRouterTable.PATH_SERVICE_SMS)
    ISmsService service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //注入参数ISmsService
        ARouter.getInstance().inject(this);

        mGoWeatherBtn = findViewById(R.id.goWeather);
        mGetMsgBtn = findViewById(R.id.getSmsMsg);
        mSentMsgBtn = findViewById(R.id.sentMsg);

        //界面跳转
        mGoWeatherBtn.setOnClickListener(v -> {
            ARouter.getInstance()
                    .build("/weather/WeatherActivity")
                    .withString("key1", "我是" + this.getPackageName() + "发出的信息").navigation();
        });
        if (service != null) {
            //获取信息
            mGetMsgBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    List<String> list = service.getSmsInfoList();
                    for (String msg : list) {
                        LogUtil.d(TAG, "msg=" + msg);
                    }
                }
            });

            //发送信息
            mSentMsgBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    service.setSmsToOne("17776106013", "小老弟，在不在？");
                }
            });
        }
    }
}