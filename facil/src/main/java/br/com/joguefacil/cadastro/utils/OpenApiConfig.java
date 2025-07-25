package br.com.joguefacil.cadastro.utils;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API Para gerenciamento de LanHouse")
                        .description("API para gerenciamento de LanHouse, com validações e documentação via Swagger.")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("Diogo Bruno")
                                .url("https://github.com/diogobruno06")
                        )
                );
    }
}