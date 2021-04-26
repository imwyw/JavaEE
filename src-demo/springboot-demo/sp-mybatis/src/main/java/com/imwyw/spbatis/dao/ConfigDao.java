package com.imwyw.spbatis.dao;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author wangyuanwei
 * @title: ConfigDao
 * @projectName springboot-demo
 * @description: 描述
 * @date 2021/4/26 9:40
 */
@Mapper
public interface ConfigDao {
    String getDataId();
}
