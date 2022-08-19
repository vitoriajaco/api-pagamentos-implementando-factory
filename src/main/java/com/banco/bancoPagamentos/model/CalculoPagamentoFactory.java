package com.banco.bancoPagamentos.model;

import com.banco.bancoPagamentos.model.calculoDesconto.CalculoPagamento;
import com.banco.bancoPagamentos.model.calculoDesconto.CalculoPagamentoAtrasado;
import com.banco.bancoPagamentos.model.calculoDesconto.CalculoPagamentoEmDia;

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

