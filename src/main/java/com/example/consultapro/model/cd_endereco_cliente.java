package com.example.consultapro.model;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "cd_endereco")
@Entity(name = "cd_endereco")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class cd_endereco_cliente {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cod_endereco;
    private String cep_endereco;
    private String endereco;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf_endereco;
    private int cod_cliente_endereco; // Chave estrangeira
}
