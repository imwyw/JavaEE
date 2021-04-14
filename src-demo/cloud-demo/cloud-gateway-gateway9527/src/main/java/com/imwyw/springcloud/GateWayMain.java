package com.imwyw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author wangyuanwei
 * @title: GateWayMain
 * @projectName cloud-demo
 * @description: 描述
 * @date 2021/4/14 8:28
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWayMain {
    public static void main(String[] args) {
        SpringApplication.run(GateWayMain.class, args);
    }
}
