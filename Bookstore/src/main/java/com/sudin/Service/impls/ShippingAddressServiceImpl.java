package com.sudin.Service.impls;

import com.sudin.Domain.ShippingAddress;
import com.sudin.Domain.UserShipping;
import com.sudin.Service.ShippingAddressService;
import org.springframework.stereotype.Service;

/**
 * Created by s-k-ii-p-s on 9/2/17.
 */
@Service
public class ShippingAddressServiceImpl implements ShippingAddressService {

    @Override
    public ShippingAddress setByUserShipping(UserShipping userShipping, ShippingAddress shippingAddress) {
        shippingAddress.setshippingAddressName(userShipping.getUserShippingName());
        shippingAddress.setshippingAddressStreet1(userShipping.getUserShippingStreet1());
        shippingAddress.setshippingAddressStreet2(userShipping.getUserShippingStreet2());
        shippingAddress.setshippingAddressCity(userShipping.getUserShippingCity());
        shippingAddress.setshippingAddressState(userShipping.getUserShippingState());
        shippingAddress.setshippingAddressCountry(userShipping.getUserShippingCountry());
        shippingAddress.setshippingAddressZipcode(userShipping.getUserShippingZipcode());

        return shippingAddress;
    }


}
