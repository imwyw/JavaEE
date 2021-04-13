package com.imwyw.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author 20009439
 * @title: LoadBalancer
 * @projectName cloud-demo
 * @description: TODO
 * @date 2021/4/12 23:07
 */
public interface LoadBalancer {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
