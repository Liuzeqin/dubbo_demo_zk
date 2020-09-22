package com.lzq.demo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.lzq.api.DemoService;

import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        try {
            System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "]");
            return "Hello " + name + ", response from DemoServiceImpl: " + InetAddress.getLocalHost();
        } catch (Exception e) {
            return "net error";
        }
    }
}
