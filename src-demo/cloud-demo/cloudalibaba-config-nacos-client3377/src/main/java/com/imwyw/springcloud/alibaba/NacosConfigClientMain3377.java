package com.imwyw.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wangyuanwei
 * @title: NacosConfigClientMain3377
 * @projectName cloud-demo
 * @description: 描述
 * @date 2021/4/15 15:44
 *
 * 配置中心
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigClientMain3377 {
    public static void main(String[] args) {
        SpringApplication.run(NacosConfigClientMain3377.class, args);
    }
}
