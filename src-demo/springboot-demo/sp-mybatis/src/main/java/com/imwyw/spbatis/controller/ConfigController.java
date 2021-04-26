package com.imwyw.spbatis.controller;

import com.imwyw.spbatis.dao.ConfigDao;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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

    @Resource
    private ConfigDao configDao;

    @GetMapping("getId")
    public String getId() {
        return configDao.getDataId();
    }
}
