package exercicio1.model;

import exercicio1.model.calculoDesconto.CalculoPagamento;
import exercicio1.model.calculoDesconto.CalculoPagamentoAtrasado;
import exercicio1.model.calculoDesconto.CalculoPagamentoEmDia;

public class CalculoPagamentoFactory {

    public CalculoPagamento getCalculoPagamento(String status) {
        if (status.equals("PAGAMENTO_ATRASADO")) {
            return new CalculoPagamentoAtrasado();
        } else if (status.equals("PAGAMENTO_EM_DIA")) {
            return new CalculoPagamentoEmDia();
        }
        return null;

    }
}

