package com.imwyw.springcloud.controller;

import com.imwyw.springcloud.entities.CommonResult;
import com.imwyw.springcloud.entities.Payment;
import com.imwyw.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 20009439
 * @title: PaymentController
 * @projectName cloud-demo
 * @description: TODO
 * @date 2021/4/8 15:02
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(Payment payment) {
        int result = paymentService.create(payment);
        log.info("***插入结果***:" + result);

        if (result > 0) {
            return new CommonResult(200, "插入数据库成功。serverport：" + serverPort, result);
        } else {
            return new CommonResult(500, "插入数据库失败");
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        if (payment != null) {
            return new CommonResult(200, "查询成功。serverport：" + serverPort, payment);
        } else {
            return new CommonResult(500, "没有对应记录");
        }
    }
}
