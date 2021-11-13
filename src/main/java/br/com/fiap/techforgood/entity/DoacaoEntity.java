package br.com.fiap.techforgood.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_doacao")
@Data
public class DoacaoEntity {

    @Id
    private Long idDoacao;

    private Date dtDoacao;

    private Integer vlDoacao;

    @OneToMany
    @Column(name = "tb_usuario_id_usuario")
    private Long idUsuario;

    @OneToMany
    @Column(name = "tb_entidade_id_entidade")
    private Long idEntidade;

}
