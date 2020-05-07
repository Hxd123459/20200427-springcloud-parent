package com.home.hjd.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 胡江迪
 * Date: 2020/4/27 0027
 * Time: 21:20
 * Description:
 *  springcloud这个架构给咱们提供的模拟http协议的工具类不叫HttpClient
 *  而是RestConfig
 */
@Configuration
public class RestConfig {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
