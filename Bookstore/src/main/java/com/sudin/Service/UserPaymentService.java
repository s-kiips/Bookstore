package com.sudin.Service;

import com.sudin.Domain.UserPayment;

/**
 * Created by s-k-ii-p-s on 9/1/17.
 */
public interface UserPaymentService {

    UserPayment findById(Long id);

    void removeById(Long id);

}
