package com.kuang.service;

import com.kuang.dao.BookMapper;
import com.kuang.entity.Books;

import java.util.List;

public class BookServiceImpl implements BookService {
    //service调dao层：组合dao层
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public BookMapper getBookMapper(){
        return bookMapper;
    }



    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBoolById(int id) {
        return bookMapper.deleteBoolById(id);
    }

    public int updateBookById(Books book) {
        return bookMapper.updateBookById(book);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
