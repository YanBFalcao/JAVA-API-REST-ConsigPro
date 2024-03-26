package model;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "cd_beneficio")
@Entity(name = "cd_beneficio")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class cd_beneficio_cliente {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private long cod_beneficio;
    private int num_especie;
    private String descricao_beneficio;
    private String uf_beneficio;
    private int matricula_1;
    private int matricula_2;
    private String senha_1;
    private String senha_2;
    private int salario_1;
    private int salario_2;
    private int cod_cliente_beneficio; // Chave estrangeira
}
