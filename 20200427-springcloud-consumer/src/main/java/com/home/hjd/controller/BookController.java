package com.home.hjd.controller;

import com.home.hjd.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 胡江迪
 * Date: 2020/4/27 0027
 * Time: 21:18
 * Description:
 */
@RestController
public class BookController {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/getAllBooksConsumer")
    public List<Book> getAllBooksConsumer(){
        List forObject = restTemplate.getForObject("http://localhost:8080/getAllBooksProvider", List.class);
        return forObject;
    }
}
