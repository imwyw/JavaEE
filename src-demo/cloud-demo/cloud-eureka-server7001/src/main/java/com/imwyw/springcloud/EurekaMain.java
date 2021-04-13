package com.imwyw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author wangyuanwei
 * @title: EurekaMain
 * @projectName cloud-demo
 * @description: 描述
 * @date 2021/4/9 10:10
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain.class, args);
    }
}
