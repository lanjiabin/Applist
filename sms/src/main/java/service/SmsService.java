package service;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.android.common.LogUtil;
import com.android.common.sms.api.ISmsService;
import com.android.common.sms.api.SmsRouterTable;

import java.util.ArrayList;
import java.util.List;

@Route(path = SmsRouterTable.PATH_SERVICE_SMS)
public class SmsService implements ISmsService {
    static final String TAG = "SmsServiceTest";

    @Override
    public List<String> getSmsInfoList() {
        List<String> smsList = new ArrayList<>();
        smsList.add("饭否？");
        smsList.add("何时？");
        smsList.add("现在！");
        smsList.add("马上。");
        return smsList;
    }

    @Override
    public void setSmsToOne(String num, String msg) {
        LogUtil.d(TAG, "已发送信息--" + msg + "--到" + num);
    }

    @Override
    public void init(Context context) {
        LogUtil.d(TAG, "context.getOpPackageName = " + context.getOpPackageName());
    }
}
