package com.sudin.Controllers;

import com.sudin.Domain.CartItem;
import com.sudin.Domain.ShoppingCart;
import com.sudin.Domain.User;
import com.sudin.Service.CartItemService;
import com.sudin.Service.ShoppingCartService;
import com.sudin.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.util.List;

/**
 * Created by s-k-ii-p-s on 9/1/17.
 */
@Controller
@RequestMapping("/shoppingCart")
public class ShoppingCartController {

    @Autowired
    private UserService userService;

    @Autowired
    private CartItemService cartItemService;

    @Autowired
    private ShoppingCartService shoppingCartService;

    @RequestMapping("/cart")
    public String shoppingCart(Model model, Principal principal){
        User user=userService.findByUsername(principal.getName());
        ShoppingCart shoppingCart=user.getShoppingCart();

        List<CartItem> cartItemList=cartItemService.findByShoppingCart(shoppingCart);
        shoppingCartService.updateShoppingCart(shoppingCart);

        model.addAttribute("cartItemList",cartItemList);
        model.addAttribute("shoppingCart",shoppingCart);
        return "shoppingCart";
    }

}
