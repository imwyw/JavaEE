package com.imwyw.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author wangyuanwei
 * @title: LoadBalancer
 * @projectName cloud-demo
 * @description: 描述
 * @date 2021/4/12 23:07
 */
public interface LoadBalancer {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
