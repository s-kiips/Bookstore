package com.sudin.Repository;

import com.sudin.Domain.CartItem;
import com.sudin.Domain.Order;
import com.sudin.Domain.ShoppingCart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by s-k-ii-p-s on 9/1/17.
 */
@Transactional
public interface CartItemRepository extends CrudRepository<CartItem, Long> {

    List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);

    List<CartItem> findByOrder(Order order);
}
