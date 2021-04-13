package com.imwyw.springcloud.impl;

import com.imwyw.springcloud.service.PaymentHystrixService;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author wangyuanwei
 * @title: PaymentHystrixImpl
 * @projectName cloud-demo
 * @description: 描述
 * @date 2021/4/13 15:44
 */
@Service
public class PaymentHystrixImpl implements PaymentHystrixService {

    @Override
    public String paymentInfo_OK(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + "   paymentInfo_OK,id：  " + id + "\t" + "哈哈哈";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        int timeNumber = 3;
        try {
            TimeUnit.SECONDS.sleep(timeNumber);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "线程池：" + Thread.currentThread().getName() + "   paymentInfo_TimeOut,id：  "
                + id + "\t" + "呜呜呜" + " 耗时(秒)" + timeNumber;
    }

}
