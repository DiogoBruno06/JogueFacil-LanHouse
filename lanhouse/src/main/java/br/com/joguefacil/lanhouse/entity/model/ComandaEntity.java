package br.com.joguefacil.lanhouse.entity.model;


import br.com.joguefacil.lanhouse.entity.dto.ComandaInputDTO;
import br.com.joguefacil.lanhouse.entity.dto.ComandaOutputDTO;
import br.com.joguefacil.lanhouse.entity.enums.StatusComandaEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "COMANDA")
public class ComandaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_comanda")
    private Long idComanda;

    @Column(name = "nome_cliente")
    private String nomeCliente;

    @Column(name = "valor_comanda")
    private Double valorComanda;

    @Column(name = "status_comanda")
    private StatusComandaEnum statusComandaEnum;

    public static ComandaEntity novaComanda() {
        ComandaEntity comanda = new ComandaEntity();
        comanda.setValorComanda(0.00);
        comanda.setStatusComandaEnum(StatusComandaEnum.ATIVO);
        return comanda;
    }
}
