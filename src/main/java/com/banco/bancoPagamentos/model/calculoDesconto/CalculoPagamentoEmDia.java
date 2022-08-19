package com.banco.bancoPagamentos.model.calculoDesconto;

import com.banco.bancoPagamentos.model.PagamentoModel;
import com.banco.bancoPagamentos.model.calculoDesconto.CalculoPagamento;

import java.math.BigDecimal;

public class CalculoPagamentoEmDia implements CalculoPagamento {
    @Override
    public BigDecimal calcularValorASerPago(BigDecimal valorAPagar, BigDecimal diferencaValor) {
        return valorAPagar;
    }

    @Override
    public BigDecimal calcularValorASerPago(PagamentoModel pagamentomodel) {
        return null;
    }


}
