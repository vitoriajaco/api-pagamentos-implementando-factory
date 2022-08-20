package exercicio2.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name= " pagamentosRecebidos")
public class RecebimentoModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    private String modalidadeRecebimento;

    @Column
    private BigDecimal valorAReceber;

    @Column(name = "diferença-valor", nullable = false)
    private BigDecimal desconto;

    @Column(name = "valor-pago", nullable = false)
    private BigDecimal valorRecebido;
}