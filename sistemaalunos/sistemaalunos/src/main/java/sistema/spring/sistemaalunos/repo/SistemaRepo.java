package sistema.spring.sistemaalunos.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import sistema.spring.sistemaalunos.model.Sistemaalunos;

public interface SistemaRepo extends JpaRepository<Sistemaalunos, Long> {
}
