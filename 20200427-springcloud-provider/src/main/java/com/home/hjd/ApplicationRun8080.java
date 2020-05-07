package com.home.hjd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 胡江迪
 * Date: 2020/4/27 0027
 * Time: 21:08
 * Description:
 */
@SpringBootApplication
@MapperScan("com.home.hjd.mapper")
public class ApplicationRun8080 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8080.class,args);
    }
}
