package com.imwyw.springcloud;

import com.imwyw.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author 20009439
 * @title: OrderMain
 * @projectName cloud-demo
 * @description: TODO
 * @date 2021/4/8 16:57
 *
 * 作为服务客户端，会调用其他微服务，使用 Ribbon + RestTemplate 实现负载均衡
 *
 * RibbonClient 针对某个服务应用负载均衡，configuration 配置负载规则
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration = MySelfRule.class)
public class OrderMain {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain.class, args);
    }
}
