package com.home.hjd.service.impl;

import com.home.hjd.model.Book;
import com.home.hjd.mapper.BookMapper;
import com.home.hjd.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 胡江迪
 * Date: 2020/4/27 0027
 * Time: 21:03
 * Description:
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;
    public List<Book> selectAllBooksService() {
        return bookMapper.selectAllBooks();
    }
}
