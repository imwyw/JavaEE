package com.imwyw.springcloud.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author 20009439
 * @title: ApplicationContextConfig
 * @projectName cloud-demo
 * @description: TODO
 * @date 2021/4/8 17:00
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
