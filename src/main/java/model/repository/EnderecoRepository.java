package model.repository;

import model.cd_endereco_cliente;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EnderecoRepository extends JpaRepository<cd_endereco_cliente,Long>{
}
