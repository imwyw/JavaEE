package com.imwyw.springcloud.controller;

import com.imwyw.springcloud.entities.CommonResult;
import com.imwyw.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author 20009439
 * @title: OrderController
 * @projectName cloud-demo
 * @description: TODO
 * @date 2021/4/8 17:02
 */
@RestController
@Slf4j
public class OrderController {
    // 调用服务地址不能写死，否则无法负载均衡
    //public static final String PAYMENT_URL = "http://localhost:8001";
    // CLOUD-PAYMENT-SERVICE 微服务名称，和注册到eureka中的名称保持一致
    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";


    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(@RequestBody Payment payment) {
        //写操作
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
    }
}
