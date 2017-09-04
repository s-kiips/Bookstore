package com.sudin.Service;

import com.sudin.Domain.*;

/**
 * Created by s-k-ii-p-s on 9/4/17.
 */
public interface OrderService {

    Order createOrder(ShoppingCart shoppingCart,
                      ShippingAddress shippingAddress,
                      BillingAddress billingAddress,
                      Payment payment,
                      String shippingMethod,
                      User user);

    Order findOne(Long id);

}
