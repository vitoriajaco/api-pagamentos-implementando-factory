package exercicio2.service;

import exercicio2.model.RecebimentoModel;
import exercicio2.repository.RecebimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecebimentoService {
    @Autowired
    private RecebimentoRepository recebimentoRepository;

    public RecebimentoModel registarRecebimento(RecebimentoModel recebimentoModel){
        return recebimentoModel;

    }

    public List<RecebimentoModel> mostrarTodosRecebimentos(){
        return recebimentoRepository.findAll();
    }

    public Optional<RecebimentoModel> buscarId(Long codigo){
        return recebimentoRepository.findById(codigo);
    }

    public RecebimentoModel cadastrarRecebimento(RecebimentoModel recebimentoModel){
        return recebimentoRepository.save(recebimentoModel);
    }
}
