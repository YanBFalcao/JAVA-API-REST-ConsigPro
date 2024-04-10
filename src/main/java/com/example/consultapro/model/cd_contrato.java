package com.example.consultapro.model;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "cd_contrato")
@Entity(name = "cd_contrato")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class cd_contrato {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cod_contrato;
    private int num_banco;
    private int parcelas_pagas;
    private int total_parcelas;
    private int percent_pago;
    private int parcelas_restantes;
    private int valor_parcela;
    private int saldo_devedor;
    private int tac;
    private double coeficiente;
    private int cod_cliente_contrato; // Chave estrangeira

}
