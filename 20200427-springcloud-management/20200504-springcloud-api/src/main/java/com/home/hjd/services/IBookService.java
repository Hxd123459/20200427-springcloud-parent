package com.home.hjd.services;

import com.home.hjd.fallback.FallBackService;
import com.home.hjd.model.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 胡江迪
 * Date: 2020/5/5 0005
 * Time: 20:55
 * Description:
 * @FeignClient 注解一定要加上，value的值
 * 是spring.application.name的值
 */
@FeignClient(value = "book-provider",fallbackFactory = FallBackService.class)
public interface IBookService {
    /**
     * 这个方法必须要和provider中的
     * 方法的名称，返回值，参数名
     * 一定要保持一致
     * @return
     */
    @GetMapping("/getAllBooksProvider")
    List<Book> getAllBooksProvider();

    /**
     * 测试feign
     * @return
     */
    @GetMapping("/all")
    List<Book> all();

    /**
     * 测试hystrix的熔断
     * @return
     * @throws Exception
     */
    @GetMapping("/allBooks")
    List<Book> allBooks() throws Exception;

    /**
     * 测试服务的降级
     * @return
     */
    @GetMapping("/tFloadLeve")
    String tFloadLeve();
}
