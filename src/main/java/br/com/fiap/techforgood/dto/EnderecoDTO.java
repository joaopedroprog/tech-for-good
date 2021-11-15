package br.com.fiap.techforgood.dto;

import br.com.fiap.techforgood.entity.EnderecoEntity;
import br.com.fiap.techforgood.entity.UsuarioEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EnderecoDTO {

    private Long idEndereco;
    private String dsLogradouro;
    private String nrNumero;
    private String dsComplemento;
    private String nrCep;
    private BairroDTO bairro;

    public EnderecoEntity toEntity() {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(this, EnderecoEntity.class);
    }

}
