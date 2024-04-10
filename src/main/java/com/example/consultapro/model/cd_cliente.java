package com.example.consultapro.model;

import com.example.consultapro.model.DTO.ClienteRequestDTO;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Table(name = "cd_cliente")
@Entity(name = "cd_cliente")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class cd_cliente {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cod_cliente;
    private String nome_cliente;
    private Date dt_nascimento;
    private String cpf;
    private String sexo;
    private String naturalidade;
    private String uf_cliente;
    private String num_rg;
    private String orgao_emissor;
    private String uf_emissao_rg;
    private Date dt_emissao_rg;
    private String nome_mae;
    private String nome_pai;
    public cd_cliente(ClienteRequestDTO data){
        this.cod_cliente = data.cod_cliente();
        this.nome_cliente = data.nome_cliente();
        this.dt_nascimento = data.dt_nascimento();
        this.cpf = data.cpf();
        this.sexo = data.sexo();
        this.naturalidade = data.naturalidade();
        this.uf_cliente = data.uf_cliente();
        this.num_rg = data.num_rg();
        this.orgao_emissor = data.orgao_emissor();
        this.uf_emissao_rg = data.uf_emissao_rg();
        this.nome_mae = data.nome_mae();
        this.nome_pai = data.nome_pai();
    }
}