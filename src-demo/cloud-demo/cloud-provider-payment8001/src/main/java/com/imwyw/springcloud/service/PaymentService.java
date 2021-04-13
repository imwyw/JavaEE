package com.imwyw.springcloud.service;

import com.imwyw.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author wangyuanwei
 * @title: PaymentService
 * @projectName cloud-demo
 * @description: 描述
 * @date 2021/4/8 15:01
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
