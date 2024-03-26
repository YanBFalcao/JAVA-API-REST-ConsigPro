package model.repository;

import model.cd_contato_cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<cd_contato_cliente,Long>{
}
