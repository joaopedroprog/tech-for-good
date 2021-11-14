package br.com.fiap.techforgood.dto;

import br.com.fiap.techforgood.entity.TipoEntity;
import br.com.fiap.techforgood.entity.UsuarioEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TipoDTO {

    private Long idTipo;
    private String dsTipo;

    public TipoDTO(TipoEntity tipoEntity){
        this.idTipo = tipoEntity.getIdTipo();
        this.dsTipo = tipoEntity.getDsTipo();
    }

}
