package com.kuang.controller;

import com.kuang.entity.Books;
import com.kuang.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    //controller 调 service
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookServiceImpl bookService;

    /**
     * 查询全部书籍，返回到一个书籍展示界面
     * @param model
     * @return
     */
    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> list = bookService.queryAllBook();
        model.addAttribute("list",list);
        return "allBook";
    }

    /**
     * 跳转到增加书籍界面
     * @return
     */
    @RequestMapping("/toAddBook")
    public String toAddPaper(){
        return "addBook";
    }

    /**
     * 添加书籍的请求
     * @param books
     * @return
     */
    @RequestMapping("/addBook")
    public String addBook(Books books){
        System.out.println("addBook=>"+books);
        bookService.addBook(books);
        //重定向到@RequestMapping("/allBook")请求
        return "redirect:/book/allBook";
    }
    /**
     * 跳转到增加修改界面
     * @return
     */
    @RequestMapping("/toUpDateBook")
    public String updateBook(int bookId,Model model){
        Books books = bookService.queryBookById(bookId);
        model.addAttribute("books",books);
        return "updateBook";
    }

    /**
     * 修改书籍
     * @param books
     * @return
     */
    @RequestMapping("/updateBook")
    public String updateBook(Books books){
        System.out.println("updateBook=>"+books);
        int i = bookService.updateBookById(books);
        if(i>0){
            System.out.println("添加成功");
        }
        return "redirect:/book/allBook";
    }

    /**
     * 删除书籍
     * @param bookId
     * @return
     */
    @RequestMapping("/deleteBook")
    public String delete(int bookId){
        bookService.deleteBoolById(bookId);
        return "redirect:/book/allBook";
    }
}
