package com.sudin.Repository;

import com.sudin.Domain.CartItem;
import com.sudin.Domain.ShoppingCart;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by s-k-ii-p-s on 9/1/17.
 */
public interface CartItemRepository extends CrudRepository<CartItem, Long> {

    List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
}
