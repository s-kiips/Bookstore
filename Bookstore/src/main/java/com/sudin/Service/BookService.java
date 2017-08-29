package com.sudin.Service;


import com.sudin.Domain.Book;

/**
 * Created by s-k-ii-p-s on 8/29/17.
 */
public interface BookService {

    Iterable<Book> findAll();

    Book findOne(Long id);
}
