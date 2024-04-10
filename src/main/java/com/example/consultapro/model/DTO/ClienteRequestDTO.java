package com.example.consultapro.model.DTO;

import java.util.Date;

public record ClienteRequestDTO(Long cod_cliente, String nome_cliente, Date dt_nascimento, String cpf, String sexo, String naturalidade,
                                String uf_cliente, String num_rg, String orgao_emissor, String uf_emissao_rg, Date dt_emissao_rg, String nome_mae, String nome_pai ) {
}
