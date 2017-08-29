package com.sudin.Repository;

import com.sudin.Domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by s-k-ii-p-s on 8/23/17.
 */

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);

    User findByEmail(String email);
}
