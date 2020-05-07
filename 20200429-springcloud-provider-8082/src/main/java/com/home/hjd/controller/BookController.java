package com.home.hjd.controller;

import com.home.hjd.model.Book;
import com.home.hjd.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 胡江迪
 * Date: 2020/4/27 0027
 * Time: 21:06
 * Description:
 */
@RestController
public class BookController {
    @Autowired
    private BookService bookService;
    @RequestMapping("/getAllBooksProvider")
    public List<Book> getAllBooksProvider(){
        System.out.println(bookService.selectAllBooksService().size());
        return bookService.selectAllBooksService();
    }
}
