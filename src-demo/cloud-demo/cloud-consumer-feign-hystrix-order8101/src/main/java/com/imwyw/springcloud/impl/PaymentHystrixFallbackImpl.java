package com.imwyw.springcloud.impl;

import com.imwyw.springcloud.service.PaymentHystrixService;
import org.springframework.stereotype.Component;

/**
 * @author wangyuanwei
 * @title: PaymentHystrixFallbackImpl
 * @projectName cloud-demo
 * @description: 服务降级解耦，降级处理逻辑统一在另外一个实现类中
 * @date 2021/4/13 21:03
 */
@Component
public class PaymentHystrixFallbackImpl implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "---- PaymentHystrixFallbackImpl fall back 【paymentInfo_OK】";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "---- PaymentHystrixFallbackImpl fall back 【paymentInfo_TimeOut】";
    }
}
