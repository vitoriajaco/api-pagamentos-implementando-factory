package com.banco.bancoPagamentos.model.calculoDesconto;

import com.banco.bancoPagamentos.model.PagamentoModel;

import java.math.BigDecimal;

public interface CalculoPagamento {

    public BigDecimal calcularValorASerPago(BigDecimal valorAPagar, BigDecimal diferencaValor) ;


    BigDecimal calcularValorASerPago(PagamentoModel pagamentomodel);
}


