package com.sudin.Service;


import com.sudin.Domain.Book;

import java.util.List;

/**
 * Created by s-k-ii-p-s on 8/29/17.
 */
public interface BookService {

    List<Book> findAll();

    Book findOne(Long id);
}
