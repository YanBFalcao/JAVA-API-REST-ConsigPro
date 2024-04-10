package com.example.consultapro.model.repository;

import com.example.consultapro.model.cd_beneficio_cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BeneficioRepository extends JpaRepository<cd_beneficio_cliente, Long> {
}
