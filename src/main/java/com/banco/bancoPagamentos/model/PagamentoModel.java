package com.banco.bancoPagamentos.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "Pagamento")
@NoArgsConstructor
public class PagamentoModel {
    public PagamentoModel(String status, BigDecimal valorAPagar, BigDecimal diferencaValor) {
        this.status = status;
        this.valorAPagar = valorAPagar;
        this.diferencaValor = diferencaValor;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    private String status;

    @Column
    private BigDecimal valorAPagar;

    @Column (name = "diferença-valor", nullable = false)
    private BigDecimal diferencaValor;

    @Column (name = "valor-pago", nullable = false)
    private BigDecimal valorPago;




}
