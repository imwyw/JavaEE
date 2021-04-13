package com.imwyw.springcloud.impl;

import com.imwyw.springcloud.dao.PaymentDao;
import com.imwyw.springcloud.entities.Payment;
import com.imwyw.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wangyuanwei
 * @title: PaymentServiceImpl
 * @projectName cloud-demo
 * @description: 描述
 * @date 2021/4/8 15:00
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
