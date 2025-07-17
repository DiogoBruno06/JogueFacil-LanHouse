package br.com.joguefacil.cadastro.entity.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClienteInputDTO {

    @Pattern(
            regexp = "^[A-ZÁÀÂÃÉÉÈÍÌÓÒÔÕÚÙÜÇa-záàâãéèêíìóòôõúùüç]+(?:[-' ]?[A-ZÁÀÂÃÉÉÈÍÌÓÒÔÕÚÙÜÇa-záàâãéèêíìóòôõúùüç]+)*$",
            message = "Nome inválido. Use apenas letras e espaços (sem números ou caracteres especiais)."
    )
    @Schema(description = "Nome completo do cliente", example = "João da Silva")
    private String nome;

    @NotNull
    @Pattern(
            regexp = "^(\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}|\\d{2}\\.\\d{3}\\.\\d{3}/\\d{4}-\\d{2})$",
            message = "CPF ou CNPJ inválido. Use o formato 000.000.000-00 ou 00.000.000/0000-00."
    )
    @Schema(description = "CPF ou CNPJ do cliente", example = "123.456.789-09")
    private String cpfCnpj;

    @NotNull
    @Pattern(
            regexp = "^\\(\\d{2}\\)\\s?9?\\d{4}-\\d{4}$",
            message = "Telefone inválido. Use o formato (99) 99999-9999 ou (99) 9999-9999."
    )
    @Schema(description = "Telefone do cliente", example = "(83) 98603-3291")
    private String telefone;

    @NotNull
    @Email(message = "Email inválido.")
    @Schema(description = "Email do cliente", example = "joao@email.com")
    private String email;

    @NotNull
    @Schema(description = "Data de nascimento do cliente", example = "1990-05-25", type = "string", format = "date")
    private LocalDate dataNascimento;

    @Pattern(
            regexp = "^[A-ZÁÀÂÃÉÉÈÍÌÓÒÔÕÚÙÜÇa-záàâãéèêíìóòôõúùüç]+(?:[-' ]?[A-ZÁÀÂÃÉÉÈÍÌÓÒÔÕÚÙÜÇa-záàâãéèêíìóòôõúùüç]+)*$",
            message = "Nome social inválido. Use apenas letras e espaços (sem números ou caracteres especiais)."
    )
    @Schema(description = "Nome social do cliente, se houver", example = "Maria das Dores")
    private String nomeSocial;
}
