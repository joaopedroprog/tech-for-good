package br.com.fiap.techforgood.dto;

import br.com.fiap.techforgood.entity.BairroEntity;
import br.com.fiap.techforgood.entity.EnderecoEntity;
import br.com.fiap.techforgood.entity.EntidadeEntity;
import br.com.fiap.techforgood.entity.TipoEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EntidadeDTO {

    private Long idEntidade;
    private String nmEntidade;
    private String dsEntidade;
    private Integer nrVoluntarios;
    private String nrCnpj;
    private String nmEmail;
    private String dsSenha;
    private EnderecoDTO endereco;
    private TipoEntity tipo;

    public EntidadeEntity toEntity() {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(this, EntidadeEntity.class);
    }
}
