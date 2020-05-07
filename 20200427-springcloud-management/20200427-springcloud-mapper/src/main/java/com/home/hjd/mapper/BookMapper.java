package com.home.hjd.mapper;

import com.home.hjd.model.Book;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 胡江迪
 * Date: 2020/4/27 0027
 * Time: 20:58
 * Description:
 */
public interface BookMapper {
    /**
     * 查询所有的书籍
     * @return
     */
    List<Book> selectAllBooks();
}
