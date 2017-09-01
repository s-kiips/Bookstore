package com.sudin.Service.impls;

import com.sudin.Domain.UserShipping;
import com.sudin.Repository.UserShippingRepository;
import com.sudin.Service.UserShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by s-k-ii-p-s on 9/1/17.
 */
@Service
public class UserShippingServiceImpl implements UserShippingService {

    @Autowired
    private UserShippingRepository userShippingRepository;

    @Override
    public UserShipping findById(Long id) {
        return userShippingRepository.findOne(id);
    }

    @Override
    public void removeById(Long id) {
        userShippingRepository.delete(id);
    }


}
