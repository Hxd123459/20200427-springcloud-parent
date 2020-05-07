package com.home.hjd.controller;

import com.home.hjd.services.IBookService;
import com.home.hjd.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 胡江迪
 * Date: 2020/5/6 0006
 * Time: 0:01
 * Description:
 */
@RestController
public class AllBookController {
    /**
     * 这个@Autowired 注入的就是api的接口
     */
    @Autowired
    private IBookService iBookService;
    @GetMapping("/all")
    public List<Book> alls(){
        return iBookService.all();
    }


    @GetMapping("/allBooks")
    public List<Book> allBooks() throws Exception {
        return iBookService.allBooks();
    }

    @GetMapping("/getAllBooksProvider")
    List<Book> getAllBooksProvider(){
        return iBookService.getAllBooksProvider();
    }

    @GetMapping("/tFloadLeve")
    String tFloadLeve(){
        return iBookService.tFloadLeve();
    }
}
