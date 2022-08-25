package com.frank.dubbo.springbootdubboapi.service;

public interface DubboDemoService {

    String firstMethod(String param);

    String fallbackMethod(String param);
}
