package com.banco.bancoPagamentos.controller;

import com.banco.bancoPagamentos.model.PagamentoModel;
import com.banco.bancoPagamentos.service.BancoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class PagamentoController {

    @Autowired
    private BancoService bancoService;

    @PostMapping(path = "/pagamentos")
    @ResponseStatus(HttpStatus.CREATED)
    public PagamentoModel registrarPagamento(@RequestBody PagamentoModel pagamentoModel) {
        return bancoService.registarPagamento(pagamentoModel);
    }

//    @GetMapping(path ="/pagamento")
//    public List<PagamentoModel> listarPagamentos(){
//
//
//    }

}
