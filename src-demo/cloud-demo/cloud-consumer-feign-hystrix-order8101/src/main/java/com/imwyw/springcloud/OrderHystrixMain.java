package com.imwyw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author wangyuanwei
 * @title: OrderHystrixMain
 * @projectName cloud-demo
 * @description: 描述
 * @date 2021/4/13 15:26
 *
 * 通常都是在服务客户端进行 hystrix断路器 降级操作
 *
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class OrderHystrixMain {

    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixMain.class, args);
    }
}
