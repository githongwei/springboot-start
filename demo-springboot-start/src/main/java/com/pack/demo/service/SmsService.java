package com.pack.demo.service;

import com.pack.demo.properties.SmsProperties;

/**
 * @version 1.0
 * @Author: 娃哈哈
 * @Description:
 * @Date: 2020-6-5 11:46
 */
public class SmsService {

    private String appid;

    private String accountSid;

    private String authToken;

    public SmsService(SmsProperties smsProperties){
        this.appid = smsProperties.getAppid();
        this.accountSid = smsProperties.getAccountSid();
        this.authToken = smsProperties.getAuthToken();
    }

    public void sendSms(){
        System.out.println("短信发送了");
    }

}
