package com.imwyw.splogin.controller;

import com.imwyw.splogin.common.CommonResult;
import com.imwyw.splogin.pojo.User;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

/**
 * @author wangyuanwei
 * @title: SignController
 * @projectName springboot-demo
 * @description: 描述
 * @date 2021/4/27 13:42
 */
@RestController
@RequestMapping("sign")
@CrossOrigin
public class SignController {

    @PostMapping("login")
    public CommonResult login(@RequestBody User requestUser) {
        String username = requestUser.getUsername();
        username = HtmlUtils.htmlEscape(username);

        return new CommonResult(200, "消息测试");
    }

}
