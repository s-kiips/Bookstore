package com.sudin.Service.impls;

import com.sudin.Domain.BillingAddress;
import com.sudin.Domain.UserBilling;
import com.sudin.Service.BillingAddressService;
import org.springframework.stereotype.Service;


@Service
public class BillingAddressServiceImpl implements BillingAddressService {

    public BillingAddress setByUserBilling(UserBilling userBilling, BillingAddress billingAddress) {
        billingAddress.setbillingAddressName(userBilling.getUserBillingName());
        billingAddress.setbillingAddressStreet1(userBilling.getUserBillingStreet1());
        billingAddress.setbillingAddressStreet2(userBilling.getUserBillingStreet2());
        billingAddress.setbillingAddressCity(userBilling.getUserBillingCity());
        billingAddress.setbillingAddressState(userBilling.getUserBillingState());
        billingAddress.setbillingAddressCountry(userBilling.getUserBillingCountry());
        billingAddress.setbillingAddressZipcode(userBilling.getUserBillingZipcode());

        return billingAddress;
    }

}
