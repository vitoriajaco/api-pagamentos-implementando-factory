package exercicio2.repository;

import exercicio2.model.RecebimentoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecebimentoRepository extends JpaRepository<RecebimentoModel, Long> {
}
