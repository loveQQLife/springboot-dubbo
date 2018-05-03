package com.kreken.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.kreken.service.DemoService;

public class DemoServiceImpl implements DemoService {
    @Override
    public String testDemo(String name) {
        return name;
    }
}
