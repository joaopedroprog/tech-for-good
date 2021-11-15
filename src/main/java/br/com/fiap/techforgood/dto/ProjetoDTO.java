package br.com.fiap.techforgood.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjetoDTO {

    private Long idProjeto;
    private String nmProjeto;
    private String dsProjeto;
    private Integer nrVoluntario;
    private Date dtInicio;
    private Date hrInicio;
    private Date hrFim;
    private EntidadeDTO entidade;
    private List<DiasSemanaDTO> diasVoluntariado;

}
