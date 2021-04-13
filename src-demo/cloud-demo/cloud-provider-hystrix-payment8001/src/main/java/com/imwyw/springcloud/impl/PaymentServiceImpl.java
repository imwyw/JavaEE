package com.imwyw.springcloud.impl;

import com.imwyw.springcloud.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author wangyuanwei
 * @title: PaymentServiceImpl
 * @projectName cloud-demo
 * @description: 描述
 * @date 2021/4/13 14:21
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Override
    public String paymentInfo_OK(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + "  paymentInfo_OK,id: " + id + "\tO(∩_∩)O哈哈~";
    }

    /**
     * 表示当 paymentInfo_TimeOut 出问题时降级至 paymentInfo_TimeOutHandler 调用
     * <p>
     * HystrixCommand 服务降级
     *
     * @param id
     * @return
     */
    @Override
    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler", commandProperties = {
            // 3秒钟以内就是正常的业务逻辑，超时就降级
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
    })

    public String paymentInfo_TimeOut(Integer id) {
        // 假设 3s 为正常值
        int timeNumber = 5;
        // 抛出异常，也会进行降级处理
        //int res = 10 / 0;
        try {
            TimeUnit.SECONDS.sleep(timeNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池：" + Thread.currentThread().getName() + "  paymentInfo_OK,id: " + id
                + "\t耗时(s)：" + timeNumber;
    }

    public String paymentInfo_TimeOutHandler(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + " provider提供服务方做降级处理，系统繁忙稍后再试： " +
                "paymentInfo_TimeOutHandler, id: " + id;
    }

}
