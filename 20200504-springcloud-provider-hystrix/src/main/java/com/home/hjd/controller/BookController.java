package com.home.hjd.controller;

import com.home.hjd.model.Book;
import com.home.hjd.service.BookService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 胡江迪
 * Date: 2020/5/6 0006
 * Time: 12:04
 * Description:
 */
@RestController
public class BookController {
    @Autowired
    private BookService bookService;
    @GetMapping("/allBooks")
//    @HystrixCommand(fallbackMethod = "allBooksFallBack")把熔断放到api中统一处理 ，不在放到provider中了

    public List<Book> allBooks() throws Exception {
        List<Book> books = bookService.selectAllBooksService();
        if (books.size()>0) {
            throw new Exception("故意抛出异常！+allBooks");
        }
        return books;
    }

    @GetMapping("/getAllBooksProvider")
    List<Book> getAllBooksProvider() throws Exception {
        List<Book> books = bookService.selectAllBooksService();
        if (books.size()>0) {
            throw new Exception("故意抛出异常！+getAllBooksProvider");
        }
        return books;
    }

    @GetMapping("/all")
    List<Book> all() throws Exception {
        List<Book> books = bookService.selectAllBooksService();
        if (books.size()>0) {
            throw new Exception("故意抛出异常！+all");
        }
        return books;
    }
    @GetMapping("/tFloadLeve")
    String tFloadLeve(){
        System.out.println("我是8084，我正常工作");
        return "我是8084，我正常工作";
    }

}
