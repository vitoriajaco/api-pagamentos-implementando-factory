package exercicio1.repository;

import exercicio1.model.PagamentoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// observar se altera o Long do ID depois
@Repository
public interface PagamentosRepository extends JpaRepository<PagamentoModel,Long> {
}
