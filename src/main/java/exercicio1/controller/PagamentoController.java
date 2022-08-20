package exercicio1.controller;

import exercicio1.model.PagamentoModel;
import exercicio1.service.BancoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class PagamentoController {

    @Autowired
    private BancoService bancoService;

    @GetMapping(path = "/pagamentos")
    public List<PagamentoModel> mostrarTodosPagamentos(){
        return bancoService.mostrarTodosPagamentos();
    }

    @GetMapping(path = "/pagamento/{codigo}")
    public Optional<PagamentoModel> buscarPorID(@PathVariable Long codigo){
        return bancoService.buscarId(codigo);
    }

    @PostMapping(path = "/pagamentos")
    @ResponseStatus(HttpStatus.CREATED)
    public PagamentoModel registrarPagamento(@RequestBody PagamentoModel pagamentoModel) {
        return bancoService.registarPagamento(pagamentoModel);
    }

    @PostMapping(path = "/pagamento")
    @ResponseStatus(HttpStatus.CREATED)
    public PagamentoModel cadastrarPagamento(@RequestBody PagamentoModel pagamentoModel){
        return bancoService.cadastrarPagamento(pagamentoModel);

    }

    @PutMapping(path = "/pagamento/{codigo}")
    public PagamentoModel alterarPagamento(@RequestBody PagamentoModel pagamentoModel){
        return bancoService.alterarPagamento(pagamentoModel);
    }

    @DeleteMapping(path = "/pagamento/{codigo}")
    public void deletarPagamento(@PathVariable Long codigo){
        bancoService.deletar(codigo);
    }



}
