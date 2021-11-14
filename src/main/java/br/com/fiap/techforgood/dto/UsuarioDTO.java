package br.com.fiap.techforgood.dto;

import br.com.fiap.techforgood.entity.UsuarioEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDTO {

    private Long idUsuario;
    private String nmUsuario;
    private Date dtNascimento;
    private String nrCpf;
    private EnderecoDTO endereco;

    public UsuarioDTO(UsuarioEntity usuarioEntity){
        this.idUsuario = usuarioEntity.getIdUsuario();
        this.nmUsuario = usuarioEntity.getNmUsuario();
        this.dtNascimento = usuarioEntity.getDtNascimento();
        this.nrCpf = usuarioEntity.getNrCpf();
        endereco = new EnderecoDTO();
    }

}
