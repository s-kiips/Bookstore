package com.sudin.Repository;

import com.sudin.Domain.Security.Role;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by s-k-ii-p-s on 8/25/17.
 */
public interface RoleRepository extends CrudRepository<Role,Long> {

    Role findByName(String name);

}
