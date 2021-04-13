package com.imwyw.springcloud.lb;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author wangyuanwei
 * @title: MyLB
 * @projectName cloud-demo
 * @description: 描述
 * @date 2021/4/12 23:10
 */
@Component
public class MyLB implements LoadBalancer {

    /**
     * 原子类型
     */
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    /**
     * 自旋锁获取访问次数，防止多线程情况下访问不一致的情况发生
     */
    private final int getAndIncrement() {
        int current;
        int next;
        do {
            current = this.atomicInteger.get();
            next = current >= Integer.MAX_VALUE ? 0 : current + 1;
        } while (!this.atomicInteger.compareAndSet(current, next));
        System.out.println("****第几次访问，次数next：" + next);
        return next;
    }

    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
        int index = getAndIncrement() % serviceInstances.size();

        return serviceInstances.get(index);
    }
}
