package com.home.hjd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 胡江迪
 * Date: 2020/5/6 0006
 * Time: 23:35
 * Description:
 */
@SpringBootApplication
@EnableConfigServer
public class ApplicationRun3081 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun3081.class,args);
    }
}
