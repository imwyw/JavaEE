package com.imwyw.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wangyuanwei
 * @title: FeignConfig
 * @projectName cloud-demo
 * @description: 描述
 * @date 2021/4/13 13:48
 */
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
