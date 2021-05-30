package com.android.router;

import com.alibaba.android.arouter.launcher.ARouter;

public class ARouterConstant {
    String PATH_PAGE_SMS = "/sms/SmsActivity";
    String PATH_PAGE_WEATHER = "/sms/WeatherActivity";
    String PATH_SERVICE_SMS = "/sms/SmsService";

    public static void navigation(String string) {
        if (string == null) {
            return;
        }
        ARouter.getInstance().build(string).navigation();
    }

}
