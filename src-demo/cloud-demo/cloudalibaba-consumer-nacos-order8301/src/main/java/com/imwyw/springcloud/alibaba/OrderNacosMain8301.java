package com.imwyw.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wangyuanwei
 * @title: com.imwyw.springcloud.alibaba.OrderNacosMain8301
 * @projectName cloud-demo
 * @description: 描述
 * @date 2021/4/15 14:57
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderNacosMain8301 {
    public static void main(String[] args) {
        SpringApplication.run(OrderNacosMain8301.class, args);
    }
}
