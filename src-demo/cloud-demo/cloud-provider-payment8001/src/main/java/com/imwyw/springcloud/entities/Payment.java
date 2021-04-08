package com.imwyw.springcloud.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author 20009439
 * @title: Payment
 * @projectName cloud-demo
 * @description: TODO
 * @date 2021/4/8 14:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
