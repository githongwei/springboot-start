package com.pack.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @version 1.0
 * @Author: 娃哈哈
 * @Description:RestTemplateConfig配置
 * @Date: 2020-6-5 11:38
 */
@Configuration
public class RestTemplateConfig {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
