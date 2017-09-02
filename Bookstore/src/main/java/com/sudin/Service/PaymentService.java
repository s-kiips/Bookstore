package com.sudin.Service;


import com.sudin.Domain.Payment;
import com.sudin.Domain.UserPayment;

public interface PaymentService {
	Payment setByUserPayment(UserPayment userPayment, Payment payment);
}
