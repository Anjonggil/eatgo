package kr.co.fastcampus.eatgo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class EatgoCustemerApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(EatgoCustemerApiApplication.class, args);
	}


	//헬로월드!!
}
