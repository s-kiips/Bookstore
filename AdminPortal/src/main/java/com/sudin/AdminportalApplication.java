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
public class AdminportalApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(AdminportalApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {

		User user = new User();
		user.setFirstName("Sudeen");
		user.setLastName("Ranjitkar");
		user.setUsername("admin");
		user.setPhone("977-9849431839");
		user.setPassword(SecurityUtility.passwordEncoder().encode("admin"));
		user.setEmail("admin@gmail.com");
		Set<UserRole> userRoles = new HashSet<>();
		Role role1 = new Role();
		role1.setRoleId(0);
		role1.setName("ROLE_ADMIN");
		userRoles.add(new UserRole(user, role1));

		userService.createUser(user, userRoles);
	}
}
