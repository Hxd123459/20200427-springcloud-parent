package com.home.hjd.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 胡江迪
 * Date: 2020/4/29 0029
 * Time: 21:28
 * Description:
 * @LoadBalanced 这个注解是ribbon组件提供，实现consumer调用provider的负载均衡模式
 *  *      如果不指定算法，则默认使用轮询
 */
@Configuration
public class RestConfig {
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    /**
     * 随机算法
     * @return
     */
    @Bean
    public IRule myRule(){
        return new RandomRule();
    }
}
