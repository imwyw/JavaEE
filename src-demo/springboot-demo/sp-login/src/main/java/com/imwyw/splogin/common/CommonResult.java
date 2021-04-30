package com.imwyw.splogin.common;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author wangyuanwei
 * @title: CommonResult
 * @projectName springboot-demo
 * @description: 描述
 * @date 2021/4/27 17:03
 */
@Data
@AllArgsConstructor
public class CommonResult {
    private int code;
    private String message;
}
