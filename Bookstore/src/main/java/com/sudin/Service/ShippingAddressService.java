package com.sudin.Service;

import com.sudin.Domain.ShippingAddress;
import com.sudin.Domain.UserShipping;

/**
 * Created by s-k-ii-p-s on 9/2/17.
 */
public interface ShippingAddressService {

    ShippingAddress setByUserShipping(UserShipping userShipping, ShippingAddress shippingAddress);

}
