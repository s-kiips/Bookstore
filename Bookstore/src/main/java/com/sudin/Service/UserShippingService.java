package com.sudin.Service;

import com.sudin.Domain.UserShipping;

/**
 * Created by s-k-ii-p-s on 9/1/17.
 */
public interface UserShippingService {

    UserShipping findById(Long id);

    void removeById(Long id);

}
