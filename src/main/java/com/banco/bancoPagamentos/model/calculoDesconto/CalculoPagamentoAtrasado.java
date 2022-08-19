package com.banco.bancoPagamentos.model.calculoDesconto;

import com.banco.bancoPagamentos.model.calculoDesconto.CalculoPagamento;

import java.math.BigDecimal;

public class CalculoPagamentoAtrasado implements CalculoPagamento {

    @Override
    public BigDecimal calcularValorASerPago(BigDecimal valorAPagar, BigDecimal diferencaValor) {
        BigDecimal valorASerPago = valorAPagar.add(diferencaValor);
        return valorASerPago;
    }
}
