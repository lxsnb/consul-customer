package com.lxs.consulapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by: lxs
 * 2018/8/22 17:43
 */
@RestController
public class HealthController {
    @RequestMapping("/health")
    public String health(){
        return "health";
    }
}
