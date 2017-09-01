package com.sudin.Service.impls;

import com.sudin.Domain.CartItem;
import com.sudin.Domain.ShoppingCart;
import com.sudin.Repository.ShoppingCartRepository;
import com.sudin.Service.CartItemService;
import com.sudin.Service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by s-k-ii-p-s on 9/1/17.
 */
@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

    @Autowired
    private ShoppingCartRepository shoppingCartRepository;

    @Autowired
    private CartItemService cartItemService;

    @Override
    public ShoppingCart updateShoppingCart(ShoppingCart shoppingCart) {

        BigDecimal cartTotal=new BigDecimal(0);
        List<CartItem> cartItemList=cartItemService.findByShoppingCart(shoppingCart);

        for (CartItem cartItem:cartItemList){
            if (cartItem.getBook().getInStockNumber()>0){
                cartItemService.updateCartItem(cartItem);
                cartTotal=cartTotal.add(cartItem.getSubtotal());
            }
        }
        shoppingCart.setGrandTotal(cartTotal);
        shoppingCartRepository.save(shoppingCart);
        return shoppingCart;
    }
}
