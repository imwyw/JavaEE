package com.imwyw.springcloud.dao;

import com.imwyw.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author wangyuanwei
 * @title: PaymentDao
 * @projectName cloud-demo
 * @description: 描述
 * @date 2021/4/8 14:59
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
