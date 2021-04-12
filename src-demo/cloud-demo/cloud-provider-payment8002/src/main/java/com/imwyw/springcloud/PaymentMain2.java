package com.imwyw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 20009439
 * @title: PaymentMain2
 * @projectName cloud-demo
 * @description: TODO
 * @date 2021/4/9 15:53
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain2 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain2.class, args);
    }
}
