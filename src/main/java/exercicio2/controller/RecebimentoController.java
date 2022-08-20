package exercicio2.controller;

import exercicio2.model.RecebimentoModel;
import exercicio2.service.RecebimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class RecebimentoController {
    @Autowired
    private RecebimentoService recebimentoService;

    @GetMapping(path = "/recebimento")
    public List<RecebimentoModel> procurarTodosRecebimentos() {
        return recebimentoService.mostrarTodosRecebimentos();
    }
    @GetMapping(path="/recebimento/{codigo}")
    public Optional<RecebimentoModel> buscarPorId(@PathVariable Long codigo){
        return recebimentoService.buscarId(codigo);
    }

    @PostMapping(path = "/recebimento/{codigo}")
    @ResponseStatus(HttpStatus.CREATED)
    public RecebimentoModel recebimentoModel(@RequestBody RecebimentoModel recebimentoModel){
        return recebimentoService.cadastrarRecebimento(recebimentoModel);
    }
}
