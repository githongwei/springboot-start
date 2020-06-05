package com.pack.controller;

import com.pack.demo.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @version 1.0
 * @Author: 娃哈哈
 * @Description:
 * @Date: 2020-6-5 14:06
 */
@Controller
public class IndexController {

    @Autowired
    private SmsService smsService;

    @RequestMapping("/")
    @ResponseBody
    public String index(){
        smsService.sendSms();
        return "调用成功";
    }

}
