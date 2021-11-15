package br.com.fiap.techforgood.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tb_dias_semana")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DiasSemanaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDiasSemana;

    private String dsDiasSemana;

}
