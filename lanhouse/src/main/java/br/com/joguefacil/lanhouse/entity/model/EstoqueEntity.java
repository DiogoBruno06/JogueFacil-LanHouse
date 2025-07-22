package br.com.joguefacil.lanhouse.entity.model;


import br.com.joguefacil.lanhouse.entity.enums.StatusProdutoEnum;
import br.com.joguefacil.lanhouse.entity.enums.TipoProdutoEstoqueEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "ESTOQUE")
public class EstoqueEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_produto")
    private Long idProduto;

    @Column(name = "nome")
    private String nome;

    @Column(name = "data_cadastro")
    private LocalDateTime dataCadastro;

    @Column(name = "data_compra")
    private LocalDate dataCompra;

    @Column(name = "quantidade")
    private Long quantidade;

    @Column(name = "tipo_produto")
    private TipoProdutoEstoqueEnum tipoProdutoEstoqueEnum;

    @Column(name = "status_produto")
    private StatusProdutoEnum statusProdutoEnum;

    @Column(name = "num_serie")
    private String numSerie;

}
