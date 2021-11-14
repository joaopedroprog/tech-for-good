package br.com.fiap.techforgood.entity;

import br.com.fiap.techforgood.dto.UsuarioDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_usuario")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    private String nmUsuario;

    private Date dtNascimento;

    private String nrCpf;

    @ManyToOne
    @JoinColumn(name = "id_endereco")
    private EnderecoEntity endereco;


    public UsuarioEntity(UsuarioDTO usuarioDTO){
        this.idUsuario = usuarioDTO.getIdUsuario();
        this.nmUsuario = usuarioDTO.getNmUsuario();
        this.dtNascimento = usuarioDTO.getDtNascimento();
        this.nrCpf = usuarioDTO.getNrCpf();
        this.endereco = new EnderecoEntity(usuarioDTO.getEndereco());

    }
}
