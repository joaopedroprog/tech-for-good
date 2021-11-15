package br.com.fiap.techforgood.dto;

import br.com.fiap.techforgood.entity.DoacaoEntity;
import br.com.fiap.techforgood.entity.UsuarioEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DoacaoDTO {

    private Long idDoacao;
    private Date dtDoacao;
    private Integer vlDoacao;
    private UsuarioDTO usuario;
    private EntidadeDTO entidade;

    public DoacaoEntity toEntity() {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(this, DoacaoEntity.class);
    }
}
