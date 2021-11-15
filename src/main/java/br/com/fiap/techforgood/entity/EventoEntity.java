package br.com.fiap.techforgood.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_evento")
@Data
public class EventoEntity {

    @Id
    private Long idEvento;

    private String nmEvento;

    private String dsEvento;

    private Date dtEvento;

    @OneToMany
    @Column(name = "tb_entidade_id_entidade")
    private Long idEntidade;

}
