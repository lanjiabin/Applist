package com.android.common.sms.api;

import com.alibaba.android.arouter.facade.template.IProvider;

import java.util.List;

/**
 * 对外暴露的接口
 * 必须继承 IProvider
 */
public interface ISmsService extends IProvider {

    /**
     * 获取消息列表
     */
    List<String> getSmsInfoList();

    /**
     * 发送信息给某人
     */
    void setSmsToOne(String num, String msg);
}
