package br.com.fiap.techforgood.dto;

import br.com.fiap.techforgood.entity.UsuarioEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDTO {

    private Long idUsuario;
    private String nmUsuario;
    private Date dtNascimento;
    private String nrCpf;
    private String nmEmail;
    private String dsSenha;
    private EnderecoDTO endereco;

    public UsuarioEntity toEntity() {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(this, UsuarioEntity.class);
    }

}
