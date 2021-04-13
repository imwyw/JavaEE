package com.imwyw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author wangyuanwei
 * @title: OrderFeignMain
 * @projectName cloud-demo
 * @description: 描述
 * @date 2021/4/13 9:53
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeignMain {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain.class, args);
    }
}
