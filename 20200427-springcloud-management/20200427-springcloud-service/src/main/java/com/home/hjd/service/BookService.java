package com.home.hjd.service;

import com.home.hjd.model.Book;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 胡江迪
 * Date: 2020/4/27 0027
 * Time: 21:02
 * Description:
 */
public interface BookService {
    /**
     * service层
     * 查询所有的图书
     * @return
     */
    List<Book> selectAllBooksService();
}
