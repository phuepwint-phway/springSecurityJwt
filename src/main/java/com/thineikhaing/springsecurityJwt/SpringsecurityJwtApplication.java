package com.thineikhaing.springsecurityJwt;

import com.thineikhaing.springsecurityJwt.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringsecurityJwtApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringsecurityJwtApplication.class, args);
	}

}