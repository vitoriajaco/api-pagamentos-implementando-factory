package com.banco.bancoPagamentos.model.calculoDesconto;

import java.math.BigDecimal;

public interface CalculoPagamento {

    public BigDecimal calcularValorASerPago(BigDecimal valorAPagar, BigDecimal diferencaValor) ;



}


