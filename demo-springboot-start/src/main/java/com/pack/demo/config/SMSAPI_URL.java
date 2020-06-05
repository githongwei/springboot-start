package com.pack.demo.config;

/**
 * @version 1.0
 * @Author: 娃哈哈
 * @Description: 短信请求API枚举
 * @Date: 2020-6-5 11:40
 */
public enum SMSAPI_URL {

    SENDSMS("https://open.ucpaas.com/ol/sms/sendsms"),
    SENDBATCHSMS("https://open.ucpaas.com/ol/sms/sendsms_batch");
    private String url;
    SMSAPI_URL(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
