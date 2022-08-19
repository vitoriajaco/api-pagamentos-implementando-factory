package com.banco.bancoPagamentos.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Pagamento")
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
