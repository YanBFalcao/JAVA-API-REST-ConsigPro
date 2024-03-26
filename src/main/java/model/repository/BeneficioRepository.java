package model.repository;

import model.cd_beneficio_cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BeneficioRepository extends JpaRepository<cd_beneficio_cliente, Long> {
}
