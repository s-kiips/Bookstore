package com.sudin;

import com.sudin.Domain.Security.Role;
import com.sudin.Domain.Security.UserRole;
import com.sudin.Domain.User;
import com.sudin.Service.UserService;
import com.sudin.Utility.SecurityUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class BookstoreApplication implements CommandLineRunner {

    @Autowired
    private UserService userService;


    public static void main(String[] args) {
        SpringApplication.run(BookstoreApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        User user1 = new User();
        user1.setFirstName("Sudin");
        user1.setLastName("Ranjitkar");
        user1.setUsername("skiips");
        user1.setPhone("977-9849431839");
        user1.setPassword(SecurityUtility.passwordEncoder().encode("p"));
        user1.setEmail("ranjitkarsudeen14@gmail.com");
        Set<UserRole> userRoles = new HashSet<>();
        Role role1 = new Role();
        role1.setRoleId(1);
        role1.setName("ROLE_USER");
        userRoles.add(new UserRole(user1, role1));

        userService.createUser(user1, userRoles);
    }
}
