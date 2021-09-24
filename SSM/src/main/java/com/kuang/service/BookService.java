package com.kuang.service;

import com.kuang.entity.Books;
import java.util.List;

public interface BookService {
    int addBook(Books books);

    //删除一本书
    int deleteBoolById(int id);

    //更新一本书
    int updateBookById(Books books);

    //查询一本书
    Books queryBookById(int id);

    //查询所有书
    List<Books> queryAllBook();
}
