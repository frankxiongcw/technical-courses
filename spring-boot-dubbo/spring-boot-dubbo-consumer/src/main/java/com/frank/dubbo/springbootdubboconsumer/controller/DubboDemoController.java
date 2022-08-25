package com.frank.dubbo.springbootdubboconsumer.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.frank.dubbo.springbootdubboapi.service.DubboDemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiong.canwei
 * @date 2022年08月25日 11:03
 */
@RestController
@RequestMapping("/dubbo")
public class DubboDemoController {

    @NacosValue(value = "${user.name.en}", autoRefreshed = true)
    private String userNameEn;

    @DubboReference(timeout = 1000,mock ="com.frank.dubbo.springbootdubboconsumer.mock.DubboDemoMock")
    DubboDemoService dubboDemoService;

    @RequestMapping("first")
    public String firstDemo(){
        return dubboDemoService.firstMethod(userNameEn);
    }

    @RequestMapping("fall")
    public String fallbackMethod(){
        return dubboDemoService.fallbackMethod(userNameEn);
    }
}
