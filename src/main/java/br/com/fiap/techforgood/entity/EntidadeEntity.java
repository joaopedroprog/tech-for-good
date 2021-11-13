package br.com.fiap.techforgood.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tb_usuario")
@Data
public class EntidadeEntity {

    @Id
    private Long idEntidade;

    private String nmEntidade;

    private String dsEntidade;

    private Integer nrVoluntarios;

    private String nrCnpj;

    @OneToMany
    @Column(name = "tb_endereco_id_endereco")
    private Long idEndereco;

    @OneToMany
    @Column(name = "tb_tipo_id_tipo")
    private Long isTipo;

}
