package com.imwyw.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author wangyuanwei
 * @title: Payment
 * @projectName cloud-demo
 * @description: 描述
 * @date 2021/4/8 16:59
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
