package com.imwyw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author wangyuanwei
 * @title: ConfigClientMain
 * @projectName cloud-demo
 * @description: 描述
 * @date 2021/4/14 15:50
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientMain {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientMain.class, args);
    }
}
