package com.sudin.Service;


import com.sudin.Domain.BillingAddress;
import com.sudin.Domain.UserBilling;

public interface BillingAddressService {
	BillingAddress setByUserBilling(UserBilling userBilling, BillingAddress billingAddress);
}
