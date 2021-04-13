package com.imwyw.springcloud.controller;

import com.imwyw.springcloud.entities.CommonResult;
import com.imwyw.springcloud.entities.Payment;
import com.imwyw.springcloud.lb.LoadBalancer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URI;
import java.util.List;

/**
 * @author wangyuanwei
 * @title: OrderController
 * @projectName cloud-demo
 * @description: 描述
 * @date 2021/4/8 17:02
 */
@RestController
@Slf4j
public class OrderController {
    /**
     * 调用服务地址不能写死，否则无法负载均衡
     */
    //public static final String PAYMENT_URL = "http://localhost:8001";

    /**
     * CLOUD-PAYMENT-SERVICE 微服务名称，和注册到eureka中的名称保持一致
     */
    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private LoadBalancer loadBalancer;

    @Resource
    private DiscoveryClient discoveryClient;

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(@RequestBody Payment payment) {
        //写操作
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
    }

    @GetMapping("/consumer/payment/getForEntity/{id}")
    public CommonResult<Payment> getPaymentForEntity(@PathVariable("id") Long id) {
        /**
         * 返回ResponseEntity对象，包含响应中的一些重要信息，比如响应头、响应状态码、响应体等
         */
        ResponseEntity<CommonResult> entity = restTemplate.getForEntity(PAYMENT_URL + "/payment/get" +
                "/" + id, CommonResult.class);

        if (entity.getStatusCode().is2xxSuccessful()) {
            return entity.getBody();
        } else {
            return new CommonResult<>(500, "操作失败！");
        }
    }

    @GetMapping("/consumer/payment/createForEntity")
    public CommonResult<Payment> createForEntity(@RequestBody Payment payment) {
        //写操作
        ResponseEntity<CommonResult> entity = restTemplate.postForEntity(
                PAYMENT_URL + "/payment/create", payment, CommonResult.class);

        if (entity.getStatusCode().is2xxSuccessful()) {
            return entity.getBody();
        } else {
            return new CommonResult<>(500, "操作失败！");
        }
    }

    @GetMapping("/consumer/payment/lb")
    public String getPaymentUrl() {
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        if (instances == null || instances.size() < 0) {
            return null;
        }
        ServiceInstance serviceInstance = loadBalancer.instances(instances);
        URI uri = serviceInstance.getUri();

        return restTemplate.getForObject(uri + "/payment/lb", String.class);
    }
}
