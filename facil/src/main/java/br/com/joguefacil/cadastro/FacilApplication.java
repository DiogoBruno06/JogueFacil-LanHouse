package br.com.joguefacil.cadastro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FacilApplication {

	public static void main(String[] args) {
		SpringApplication.run(FacilApplication.class, args);
	}

}
