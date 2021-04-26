package com.imwyw.spbatis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangyuanwei
 * @title: ConfigController
 * @projectName springboot-demo
 * @description: 描述
 * @date 2021/4/26 9:37
 */
@RestController
@RequestMapping("config")
public class ConfigController {

    @GetMapping("getId")
    public String getId() {
        return "hello config!!!";
    }
}
