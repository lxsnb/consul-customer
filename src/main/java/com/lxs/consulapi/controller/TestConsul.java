package com.lxs.consulapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 调用consul-api的方法
 * Create by: lxs
 * 2018/8/22 17:39
 */
@RestController
public class TestConsul {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/getOthersMsg")
    public String getOthersMsg(){
        String rs = restTemplate.getForObject("http://consul2/getMessage", String.class);
        return "调用别人的方法返回："+rs;
    }
}
