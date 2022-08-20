package exercicio2.model.CalculoRecebimento;

import exercicio2.model.RecebimentoModel;

import java.math.BigDecimal;

public interface CalculoRecebimento {

    public BigDecimal calcularValorASerRecebido(RecebimentoModel recebimentoModel);
}
