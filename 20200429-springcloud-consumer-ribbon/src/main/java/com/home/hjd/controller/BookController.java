package com.home.hjd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.awt.print.Book;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 胡江迪
 * Date: 2020/4/29 0029
 * Time: 21:34
 * Description:
 * http://book-provider/getAllBooks中的book-provider
 * 就是provider生产者的application-name
 * getAllBooks就是provider的controller层的mapping地址
 */
@RestController
public class BookController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @GetMapping("/getAllBooks")
    public List<Book> getAllBooks(){
        return restTemplate.getForObject("http://book-provider/getAllBooksProvider",List.class);
    }

    /**
     * ribbon脱离eureka实现负载均衡
     * 访问的时候报错:No instances available for localhost
     * 已经可以访问到这个信息了，但是会报错，原因是
     * 在ribbon脱离eureka实现负载均衡的时候必须要求使用正式环境(上线环境)
     * 也就是说必须要有外网ip(公网ip)(不能使用localhost)
     * 可以使用花生壳来进行测试(收费)-->内网穿透
     * @return
     */
    @GetMapping("/onEureka")
    public List<Book> onEureka(){
        //1.根据application.properties文件中所配置的算法规则最终需要找到Server服务器信息
        ServiceInstance choose = loadBalancerClient.choose("book-provider");
        //2.Server对象中有provider服务器的ip地址以及端口号，获取选择出来的那一台provider的ip地址
        String host = choose.getHost();
        System.out.println(host);
        //3.获取端口号
        int port = choose.getPort();
        System.out.println(port);
        return restTemplate.getForObject("http://"+host+":"+port+"/getAllBooksProvider", List.class);
    }
}
