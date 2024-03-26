package model;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "cd_cliente")
@Entity(name = "cd_cliente")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class cd_contrato {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
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
