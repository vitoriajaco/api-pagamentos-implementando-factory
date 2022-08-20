package exercicio2.model.CalculoRecebimento;

import exercicio2.model.RecebimentoModel;

import java.math.BigDecimal;

public class DinheiroPixCheque implements CalculoRecebimento{

    @Override
    public BigDecimal calcularValorASerRecebido(RecebimentoModel recebimentoModel) {
        return recebimentoModel.getValorAReceber();
    }
}
