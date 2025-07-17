package br.com.joguefacil.cadastro;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class FacilApplicationTests {

	@Test
	void contextLoads() {
	}

}
