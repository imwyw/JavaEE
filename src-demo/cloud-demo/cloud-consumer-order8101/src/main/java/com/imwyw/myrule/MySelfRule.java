package com.imwyw.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wangyuanwei
 * @title: MySelfRule
 * @projectName cloud-demo
 * @description: 描述
 * @date 2021/4/12 22:46
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule() {
        // 定义为随机规则
        return new RandomRule();
    }
}
