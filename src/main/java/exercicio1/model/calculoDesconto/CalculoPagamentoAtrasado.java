package exercicio1.model.calculoDesconto;

import exercicio1.model.PagamentoModel;

import java.math.BigDecimal;

public class CalculoPagamentoAtrasado implements CalculoPagamento {

    @Override
    public BigDecimal calcularValorASerPago(BigDecimal valorAPagar, BigDecimal diferencaValor) {
        BigDecimal valorASerPago = valorAPagar.add(diferencaValor);
        return valorASerPago;
    }

    @Override
    public BigDecimal calcularValorASerPago(PagamentoModel pagamentomodel) {
        return null;
    }


}
