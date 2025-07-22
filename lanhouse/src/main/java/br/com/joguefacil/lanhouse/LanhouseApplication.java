package br.com.joguefacil.lanhouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class LanhouseApplication {

	public static void main(String[] args) {
		SpringApplication.run(LanhouseApplication.class, args);
	}

}
