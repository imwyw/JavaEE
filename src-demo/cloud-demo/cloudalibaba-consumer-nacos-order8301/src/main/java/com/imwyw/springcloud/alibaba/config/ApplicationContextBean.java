package com.imwyw.springcloud.alibaba.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author wangyuanwei
 * @title: ApplicationContextBean
 * @projectName cloud-demo
 * @description: 描述
 * @date 2021/4/15 15:07
 */
@Configuration
public class ApplicationContextBean {

    /**
     * nacos 自带负载均衡
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate getTemplate() {
        return new RestTemplate();
    }
}
