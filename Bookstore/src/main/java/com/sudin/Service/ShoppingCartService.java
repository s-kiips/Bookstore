package com.sudin.Service;

import com.sudin.Domain.ShoppingCart;

/**
 * Created by s-k-ii-p-s on 9/1/17.
 */
public interface ShoppingCartService {

    ShoppingCart updateShoppingCart(ShoppingCart shoppingCart);

    void clearShoppingCart(ShoppingCart shoppingCart);

}
