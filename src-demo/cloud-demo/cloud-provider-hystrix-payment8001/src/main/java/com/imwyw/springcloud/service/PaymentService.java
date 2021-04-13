package com.imwyw.springcloud.service;

/**
 * @author wangyuanwei
 * @title: PaymentService
 * @projectName cloud-demo
 * @description: 描述
 * @date 2021/4/13 14:20
 */
public interface PaymentService {
    String paymentInfo_OK(Integer id);

    String paymentInfo_TimeOut(Integer id);
}
