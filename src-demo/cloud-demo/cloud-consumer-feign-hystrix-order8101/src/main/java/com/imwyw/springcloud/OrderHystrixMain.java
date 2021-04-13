package com.imwyw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author wangyuanwei
 * @title: OrderHystrixMain
 * @projectName cloud-demo
 * @description: 描述
 * @date 2021/4/13 15:26
 */
@SpringBootApplication
@EnableFeignClients
public class OrderHystrixMain {

    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixMain.class, args);
    }
}
