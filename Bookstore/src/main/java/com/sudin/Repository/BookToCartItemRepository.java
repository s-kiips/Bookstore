package com.sudin.Repository;

import com.sudin.Domain.BookToCartItem;
import com.sudin.Domain.CartItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by s-k-ii-p-s on 9/2/17.
 */
@Transactional
public interface BookToCartItemRepository extends CrudRepository<BookToCartItem,Long> {

    void deleteByCartItem(CartItem cartItem);

}
