package com.sudin.Service;

import com.sudin.Domain.*;

import java.util.List;

/**
 * Created by s-k-ii-p-s on 9/1/17.
 */
public interface CartItemService {

    List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);

    CartItem updateCartItem(CartItem cartItem);

    CartItem addBookToCartItem(Book book, User user, int qty);

    CartItem findById(Long id);

    void removeCartItem(CartItem cartItem);

    CartItem save(CartItem cartItem);

    List<CartItem> findByOrder(Order order);

}
