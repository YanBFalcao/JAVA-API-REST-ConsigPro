package com.example.consultapro.model;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "cd_dados_bancarios")
@Entity(name = "cd_dados_bancarios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class cd_dados_bancarios_cliente {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cod_dadosbancarios;
    private int numero_banco;
    private String descricao_banco;
    private int num_agencia;
    private int dv_agencia;
    private int num_conta;
    private int dv_conta;
    private String tp_conta; // Conta corrente, poupança, salário, etc
    private String tp_pagamento; // Conta corrente, OP, saque, boleto, etc
    private int cod_cliente_dadosbancarios; // Chave Estrangeira
}
