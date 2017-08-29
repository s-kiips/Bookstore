package com.sudin.Repository;

import com.sudin.Domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by s-k-ii-p-s on 8/28/17.
 */
public interface BookRepository extends CrudRepository<Book, Long> {



}
