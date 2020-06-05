package com.pack.demo.properties;

import com.pack.demo.service.SmsService;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @version 1.0
 * @Author: 娃哈哈
 * @Description:
 * @Date: 2020-6-5 13:37
 */
@Configuration
@EnableConfigurationProperties(SmsProperties.class)
public class SmsAutoConfiguration {

    @Bean
    public SmsService getBean(SmsProperties smsProperties){
        SmsService smsService = new SmsService(smsProperties);
        return smsService;
    }

}
