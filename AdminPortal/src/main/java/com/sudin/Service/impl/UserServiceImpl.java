package com.sudin.Service.impl;

import com.sudin.Domain.Security.PasswordResetToken;
import com.sudin.Domain.Security.UserRole;
import com.sudin.Domain.User;
import com.sudin.Repository.PasswordResetTokenRepository;
import com.sudin.Repository.RoleRepository;
import com.sudin.Repository.UserRepository;
import com.sudin.Service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by s-k-ii-p-s on 8/25/17.
 */

@Service
public class UserServiceImpl implements UserService {

    private static final Logger LOG= LoggerFactory.getLogger(UserService.class);


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public User createUser(User user, Set<UserRole> userRoles) throws Exception {
        User localUser = userRepository.findByUsername(user.getUsername());
        if (localUser != null) {
            LOG.info("user {} already exists. Nothing will be done", user.getUsername());
        } else {
            for (UserRole ur : userRoles) {
                roleRepository.save(ur.getRole());
            }
        user.getUserRoles().addAll(userRoles);
            localUser=userRepository.save(user);
        }
        return localUser;
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

}
