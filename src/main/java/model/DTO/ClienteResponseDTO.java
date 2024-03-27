package model.DTO;

import model.cd_cliente;
import java.util.Date;

public record ClienteResponseDTO(Long cod_cliente, String nome_cliente, Date dt_nascimento, String cpf, String sexo, String naturalidade,
                                 String uf_cliente, String num_rg, String orgao_emissor,String uf_emissao_rg, Date dt_emissao_rg, String nome_mae, String nome_pai) {
    public ClienteResponseDTO(cd_cliente cliente){
        this(cliente.getCod_cliente(), cliente.getNome_cliente(), cliente.getDt_nascimento(), cliente.getCpf(), cliente.getSexo(), cliente.getNaturalidade(),
                cliente.getUf_cliente(), cliente.getNum_rg(), cliente.getOrgao_emissor(), cliente.getUf_emissao_rg(), cliente.getDt_emissao_rg(), cliente.getNome_mae(), cliente.getNome_pai());
    }

}