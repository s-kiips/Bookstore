package com.sudin.Controllers;

import com.sudin.Domain.Book;
import com.sudin.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;


/**
 * Created by s-k-ii-p-s on 8/28/17.
 */
@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;


    @RequestMapping(value = "/add")
    public String addBook(Model model){
        Book book=new Book();
        model.addAttribute("book",book);
        return "addBook";
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String addBookPost(
            @ModelAttribute("book") Book book, HttpServletRequest httpServletRequest){

        bookService.save(book);
        MultipartFile bookImage=book.getBookImage();
        try{
            byte[] bytes=bookImage.getBytes();
            String name=book.getId()+".png";
            BufferedOutputStream stream = new BufferedOutputStream(
                    new FileOutputStream(new File("AdminPortal/src/main/resources/static/image/book/" + name)));
            stream.write(bytes);
            stream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:bookList";
    }

    @RequestMapping("/bookList")
    public String bookList(Model model){
        List<Book> bookList=bookService.findAll();
        model.addAttribute("bookList",bookList);
        return "bookList";
    }


}
