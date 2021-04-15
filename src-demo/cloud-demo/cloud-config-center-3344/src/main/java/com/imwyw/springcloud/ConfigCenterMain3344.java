package com.imwyw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author wangyuanwei
 * @title: ConfigCenterMain
 * @projectName cloud-demo
 * @description: 描述
 * @date 2021/4/14 14:28
 *
 * 如下地址可以访问github上yml配置
 * http://localhost:3344/master/config-dev.yml
 * http://localhost:3344/config-dev/master
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterMain3344 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterMain3344.class, args);
    }
}
