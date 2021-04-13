package com.imwyw.springcloud.impl;

import com.imwyw.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import java.sql.Time;
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

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        int timeNumber = 3;
        try {
            TimeUnit.SECONDS.sleep(timeNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池：" + Thread.currentThread().getName() + "  paymentInfo_OK,id: " + id
                + "\t耗时(s)：" + timeNumber;
    }
}
