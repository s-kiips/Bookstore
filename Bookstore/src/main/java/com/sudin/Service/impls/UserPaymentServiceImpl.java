package com.sudin.Service.impls;

import com.sudin.Domain.UserPayment;
import com.sudin.Repository.UserPaymentRepository;
import com.sudin.Service.UserPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by s-k-ii-p-s on 9/1/17.
 */
@Service
public class UserPaymentServiceImpl implements UserPaymentService {

    @Autowired
    private UserPaymentRepository userPaymentRepository;

    @Override
    public UserPayment findById(Long id) {
        return userPaymentRepository.findOne(id);
    }

    @Override
    public void removeById(Long id) {
        userPaymentRepository.delete(id);
    }


}
