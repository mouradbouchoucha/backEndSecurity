package com.mrd.backEndSecurity;

import com.mrd.backEndSecurity.models.Role;
import com.mrd.backEndSecurity.models.User;
import com.mrd.backEndSecurity.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class BackEndSecurityApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	public static void main(String[] args) {
		SpringApplication.run(BackEndSecurityApplication.class, args);
	}

	public void run(String ... args) {
		User adminAccount = userRepository.findByRole(Role.ADMIN);

		if (adminAccount == null) {
			User user = new User();
			user.setFirstName("admin");
			user.setLastName("admin");
			user.setEmail("admin@gmail.com");
			user.setPassword(new BCryptPasswordEncoder().encode("admin"));
			user.setRole(Role.ADMIN);
			userRepository.save(user);
		}}
}
