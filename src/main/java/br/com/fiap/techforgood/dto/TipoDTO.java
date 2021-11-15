package br.com.fiap.techforgood.dto;

import br.com.fiap.techforgood.entity.BairroEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TipoDTO {

    private Long idTipo;
    private String dsTipo;

    public TipoDTO toEntity() {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(this, TipoDTO.class);
    }
}
