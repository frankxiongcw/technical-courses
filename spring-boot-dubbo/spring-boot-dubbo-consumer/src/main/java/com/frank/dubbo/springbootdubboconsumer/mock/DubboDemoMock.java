package com.frank.dubbo.springbootdubboconsumer.mock;

import com.frank.dubbo.springbootdubboapi.service.DubboDemoService;

/**
 * @author xiong.canwei
 * @date 2022年08月25日 14:25
 */
public class DubboDemoMock implements DubboDemoService {
    @Override
    public String firstMethod(String param) {
        return "Have no "+param;
    }

    @Override
    public String fallbackMethod(String param) {
        return "Fallback:Have no "+param;
    }
}
