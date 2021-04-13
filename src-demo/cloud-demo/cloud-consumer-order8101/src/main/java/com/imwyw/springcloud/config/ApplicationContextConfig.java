package com.imwyw.springcloud.config;


import org.springframework.cloud.client.loadbalancer.LoadBalanced;
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
    //@LoadBalanced // 赋予RestTemplate负载均衡的能力,ribbon负载均衡注解
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
