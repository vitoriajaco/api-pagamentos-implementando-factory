package exercicio1.service;

import exercicio1.model.CalculoPagamentoFactory;
import exercicio1.model.PagamentoModel;
import exercicio1.model.calculoDesconto.CalculoPagamento;
import exercicio1.repository.PagamentosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class BancoService {
    @Autowired
    private PagamentosRepository pagamentosRepository;

    public PagamentoModel registarPagamento(PagamentoModel pagamentoModel) {
        CalculoPagamentoFactory calculoPagamentoFactory = new CalculoPagamentoFactory();
        CalculoPagamento pagamento = calculoPagamentoFactory.getCalculoPagamento(pagamentoModel.getStatus());
        BigDecimal valorpago = pagamento.calcularValorASerPago(pagamentoModel.getValorAPagar(), pagamentoModel.getDiferencaValor());
        pagamentoModel.setValorPago(valorpago);
        return pagamentoModel;
    }

    public List<PagamentoModel> mostrarTodosPagamentos() {
        return pagamentosRepository.findAll();
    }

    public Optional<PagamentoModel> buscarId(Long codigo) {
        return pagamentosRepository.findById(codigo);


    }

    public PagamentoModel cadastrarPagamento(PagamentoModel pagamentomodel) {
        CalculoPagamentoFactory factory = new CalculoPagamentoFactory();
        BigDecimal valor = factory.getCalculoPagamento(pagamentomodel.getStatus()).calcularValorASerPago(pagamentomodel);
        pagamentomodel.getCodigo();
        pagamentomodel.getValorAPagar();
        pagamentomodel.getDiferencaValor();
        pagamentomodel.setDiferencaValor(valor);
        return pagamentosRepository.save(pagamentomodel);

    }

    public PagamentoModel alterarPagamento(PagamentoModel pagamentomodel){

        CalculoPagamentoFactory factory = new CalculoPagamentoFactory();
        BigDecimal valor = factory.getCalculoPagamento(pagamentomodel.getStatus()).calcularValorASerPago(pagamentomodel);
        pagamentomodel.getCodigo();
        pagamentomodel.getValorAPagar();
        pagamentomodel.getDiferencaValor();
        pagamentomodel.setDiferencaValor(valor);
        return pagamentosRepository.save(pagamentomodel);
    }

    public void deletar(Long codigo) {
        pagamentosRepository.deleteById(codigo);
    }

}
