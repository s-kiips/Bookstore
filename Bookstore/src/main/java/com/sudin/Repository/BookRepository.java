package com.sudin.Repository;

import com.sudin.Domain.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


/**
 * Created by s-k-ii-p-s on 8/29/17.
 */
public interface BookRepository extends CrudRepository<Book,Long> {

    List<Book> findByCategory(String category);

    List<Book> findByTitleContaining(String title);

}
