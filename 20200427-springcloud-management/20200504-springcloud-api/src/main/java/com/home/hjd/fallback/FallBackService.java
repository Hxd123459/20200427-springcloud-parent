package com.home.hjd.fallback;

import com.home.hjd.services.IBookService;
import com.home.hjd.model.Book;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 胡江迪
 * Date: 2020/5/6 0006
 * Time: 12:44
 * Description:
 * FallbackFactory是一个统一熔断处理工厂
 * 需要告诉该工厂需要处理哪一个类的熔断
 * 无论是consumer调用api还是api调用provider，都是和api相关的，
 * 所以选择在api出熔断
 * 熔断api之后必须要重写api接口中所有的方法
 */
@Component
public class FallBackService implements FallbackFactory<IBookService> {
    public IBookService create(Throwable throwable) {
        IBookService iBookService=new IBookService(){
            public List<Book> getAllBooksProvider() {
                return null;
            }

            public List<Book> all() {
                System.out.println("查询所有书籍的熔断！all");
                return null;
            }

            public List<Book> allBooks() {
                System.out.println("查询所有书籍的熔断！allbooks");
                return null;
            }
            public String tFloadLeve() {
                System.out.println("我是8084，我被降级了");
               return "服务器繁忙，请稍后重试！";
            }
        };
        return iBookService;
    }
}
