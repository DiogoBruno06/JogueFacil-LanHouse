package br.com.joguefacil.cadastro;

import org.springframework.boot.SpringApplication;

public class TestFacilApplication {

	public static void main(String[] args) {
		SpringApplication.from(FacilApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
