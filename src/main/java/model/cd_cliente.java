package model;

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
}
