package com.sudin.Service;

import com.sudin.Domain.Book;
import com.sudin.Domain.CartItem;
import com.sudin.Domain.ShoppingCart;
import com.sudin.Domain.User;

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

}
