package exercicio2.model.CalculoRecebimento;

import exercicio2.model.RecebimentoModel;

import java.math.BigDecimal;

public class ValeRefeicao implements CalculoRecebimento{


    @Override
    public BigDecimal calcularValorASerRecebido(RecebimentoModel recebimentoModel) {
        return recebimentoModel.getValorAReceber().subtract(recebimentoModel.getValorAReceber()
                .multiply(new BigDecimal("0.042")));
    }
}
