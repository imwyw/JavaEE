package com.imwyw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author wangyuanwei
 * @title: PaymentHystrixMain
 * @projectName cloud-demo
 * @description: 描述
 * @date 2021/4/13 14:18
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentHystrixMain {
    public static void main(String[] args) {
        SpringApplication.run(PaymentHystrixMain.class, args);
    }
}
