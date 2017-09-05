package com.sudin.Controllers;

import com.sudin.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * Created by s-k-ii-p-s on 9/5/17.
 */
@RestController
public class ResourceController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/book/removeList", method = RequestMethod.POST)
    public String removeList(
            @RequestBody ArrayList<String> bookList, Model model
    ) {
        for (String id : bookList) {
            String bookId = id.substring(8);
            bookService.removeOne(Long.parseLong(bookId));
        }
        return "delete success";
    }

}
