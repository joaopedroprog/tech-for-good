package br.com.fiap.techforgood.dto;

import br.com.fiap.techforgood.entity.DiasSemanaEntity;
import br.com.fiap.techforgood.entity.TipoEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DiasSemanaDTO {

    private Long idDiasSemana;
    private String dsDiasSemana;

    public DiasSemanaDTO(DiasSemanaEntity diasSemanaEntity){
        this.idDiasSemana = diasSemanaEntity.getIdDiasSemana();
        this.dsDiasSemana = diasSemanaEntity.getDsDiasSemana();
    }

}
