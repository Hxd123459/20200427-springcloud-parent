package com.home.hjd.controller;

import com.home.hjd.model.Book;
import com.home.hjd.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 胡江迪
 * Date: 2020/5/7 0007
 * Time: 23:10
 * Description:
 */
@RestController
public class UserController {
    @Autowired
    private BookService bookService;
    /**
     * 测试分布式配置中心
     * @return
     */
    @GetMapping("/testProperties")
    List<Book> testProperties(){
        return bookService.selectAllBooksService();
    }
}
