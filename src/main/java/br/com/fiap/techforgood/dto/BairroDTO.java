package br.com.fiap.techforgood.dto;

import br.com.fiap.techforgood.entity.BairroEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BairroDTO {

    private Long idBairro;
    private String dsBairro;

    public BairroDTO(BairroEntity bairroEntity){
        this.idBairro = bairroEntity.getIdBairro();
        this.dsBairro = bairroEntity.getDsBairro();
    }

}
