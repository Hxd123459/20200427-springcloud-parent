package com.home.hjd.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 胡江迪
 * Date: 2020/5/7 0007
 * Time: 0:29
 * Description:
 */
@RestController
public class TestController {
    @Value("${server.port}")
    String port;
    @Value("${spring.datasource.driver-class-name}")
    String driverClassName;


    @GetMapping("/getInfo")
    public String getInfo(){
        return port+"---"+driverClassName;
    }
}
