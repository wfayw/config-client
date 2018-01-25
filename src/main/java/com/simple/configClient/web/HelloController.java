package com.simple.configClient.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by WXM on 2017/8/8.
 */
@RestController
@RefreshScope
public class HelloController {
    @Value("${server.name}")
    private String name;

    @RequestMapping("/hello")
    public String hello() {
        return name;
    }
}
