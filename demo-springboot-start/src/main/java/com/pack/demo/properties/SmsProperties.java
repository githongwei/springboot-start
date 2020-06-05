package com.pack.demo.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @version 1.0
 * @Author: 娃哈哈
 * @Description:
 * @Date: 2020-6-5 11:42
 */
@ConfigurationProperties(prefix = "sms-config")
public class SmsProperties {

    private String appid;

    private String accountSid;

    private String authToken;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getAccountSid() {
        return accountSid;
    }

    public void setAccountSid(String accountSid) {
        this.accountSid = accountSid;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }
}
