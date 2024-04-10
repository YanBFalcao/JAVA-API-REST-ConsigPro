package com.example.consultapro.model;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "cd_contato")
@Entity(name = "cd_contato")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class cd_contato_cliente {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cod_contato;
    private int telefone_1;
    private int telefone_2;
    private int telefone_3;
    private String email_1;
    private String email_2;
    private int cod_cliente_contato; // Chave Estrangeira


}
