package exercicio2.model;

import exercicio2.model.CalculoRecebimento.CalculoRecebimento;
import exercicio2.model.CalculoRecebimento.CartaoCredito;
import exercicio2.model.CalculoRecebimento.CartaoDebito;
import exercicio2.model.CalculoRecebimento.ValeRefeicao;

public class RecebimentoFactory {
    public CalculoRecebimento calculoRecebimento(String tipoDePagamento) {
        if (tipoDePagamento.equals("CARTAO_DEBITO")) {
            return new CartaoDebito();
        } else if (tipoDePagamento.equals("DIN_PIX_CHEQUE")) {
            return new CartaoCredito();

        } else if (tipoDePagamento.equals("CARTAO_CREDITO")) {
            return new CartaoCredito();

        } else if (tipoDePagamento.equals("VALE_REFEICAO")) {
            return new ValeRefeicao();
        }
        return null;

    }

}
