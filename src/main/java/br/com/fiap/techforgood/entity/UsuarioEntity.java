package br.com.fiap.techforgood.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_usuario")
@Data
public class UsuarioEntity {

    @Id
    private Long idUsuario;

    private String nmUsuario;

    private Date dtNascimento;

    private String nrCpf;

    @OneToMany
    @Column(name = "tb_endereco_id_endereco")
    private Long idEndereco;

}
