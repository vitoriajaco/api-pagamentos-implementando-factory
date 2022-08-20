package exercicio1.model.calculoDesconto;

import exercicio1.model.PagamentoModel;

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
