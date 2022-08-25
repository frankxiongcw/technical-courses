package com.frank.dubbo.springbootdubboprovider.service;

import com.frank.dubbo.springbootdubboapi.service.DubboDemoService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author xiong.canwei
 * @date 2022年08月25日 10:02
 */
@DubboService
public class DubboDemoServiceImpl implements DubboDemoService {
    @Override
    public String firstMethod(String param) {
        return "Hello "+param;
    }

    @Override
    public String fallbackMethod(String param) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
