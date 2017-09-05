package com.sudin.Service.impl;

import com.sudin.Domain.Book;
import com.sudin.Repository.BookRepository;
import com.sudin.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by s-k-ii-p-s on 8/28/17.
 */
@Service
public class BookServiceImp implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> findAll() {
        return (List<Book>)bookRepository.findAll();
    }

    @Override
    public Book findOne(Long id) {
        return bookRepository.findOne(id);
    }

    @Override
    public void removeOne(Long id) {
        bookRepository.delete(id);
    }
}
