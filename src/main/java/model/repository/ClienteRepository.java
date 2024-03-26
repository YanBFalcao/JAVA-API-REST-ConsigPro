package model.repository;

import model.cd_cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<cd_cliente,Long>{
}
