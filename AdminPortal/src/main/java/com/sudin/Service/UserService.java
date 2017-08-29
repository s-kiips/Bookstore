package com.sudin.Service;

import com.sudin.Domain.Security.UserRole;
import com.sudin.Domain.User;

import java.util.Set;

/**
 * Created by s-k-ii-p-s on 8/25/17.
 */
public interface UserService {


    User createUser(User user, Set<UserRole> userRoles) throws Exception;

    User save(User user);

}
