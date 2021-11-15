package br.com.fiap.techforgood.dto;

import br.com.fiap.techforgood.entity.BairroEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BairroDTO {

    private Long idBairro;
    private String dsBairro;

    public BairroEntity toEntity() {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(this, BairroEntity.class);
    }

}
