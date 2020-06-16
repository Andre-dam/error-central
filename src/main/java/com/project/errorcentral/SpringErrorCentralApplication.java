package com.project.errorcentral;

import com.project.errorcentral.entity.User;
import com.project.errorcentral.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.annotation.PostConstruct;

@EnableJpaAuditing
@SpringBootApplication
public class SpringErrorCentralApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringErrorCentralApplication.class, args);
	}


	@Autowired
	UserRepository userRepository;

	@PostConstruct
	private void init(){
		User user1 = User.builder()
				.name("andre")
				.password("xalala")
				.email("ferunosxd@gmail.com")
				.build();

		userRepository.save(user1);


		User user2 = User.builder()
				.name("sds")
				.password("asd")
				.email("ferunosxd@gmail.com")
				.build();
		userRepository.save(user2);
	}
}
