package com.pack.demo.bean;

/**
 * @version 1.0
 * @Author: 娃哈哈
 * @Description: 创建SendSMSDTO传输类,用于参数传递
 * @Date: 2020-6-5 11:36
 */
public class SendSMSDTO {

    private String templateId;

    private String param;

    private String mobile;

    private String uid;

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
