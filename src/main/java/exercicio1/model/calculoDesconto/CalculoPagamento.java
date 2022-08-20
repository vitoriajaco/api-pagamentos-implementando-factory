package exercicio1.model.calculoDesconto;

import exercicio1.model.PagamentoModel;

import java.math.BigDecimal;

public interface CalculoPagamento {

    public BigDecimal calcularValorASerPago(BigDecimal valorAPagar, BigDecimal diferencaValor) ;


    BigDecimal calcularValorASerPago(PagamentoModel pagamentomodel);
}


