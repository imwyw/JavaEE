package com.imwyw.springcloud.service;

import com.imwyw.springcloud.entities.CommonResult;
import com.imwyw.springcloud.entities.Payment;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author wangyuanwei
 * @title: PaymentFeignService
 * @projectName cloud-demo
 * @description: 描述
 * @date 2021/4/13 9:56
 *
 * OpenFeign 自带负载均衡调用，标记对应微服务名称，新增方法签名一致，会自动进行负载均衡
 *
 * FeignClient value 是 eureka 服务名称
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    /**
     * 对应provider微服务中controller api
     * @param id
     * @return
     */
    @GetMapping(value = "/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);
}
