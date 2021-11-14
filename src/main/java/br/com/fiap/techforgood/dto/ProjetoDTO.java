package br.com.fiap.techforgood.dto;

import br.com.fiap.techforgood.entity.ProjetoEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
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

    public ProjetoDTO(ProjetoEntity projetoEntity){
        this.idProjeto = projetoEntity.getIdProjeto();
        this.nmProjeto = projetoEntity.getNmProjeto();
        this.dsProjeto = projetoEntity.getDsProjeto();
        this.nrVoluntario = projetoEntity.getNrVoluntario();
        this.dtInicio = projetoEntity.getDtInicio();
        this.hrInicio = projetoEntity.getHrInicio();
        this.hrFim = projetoEntity.getHrFim();
        this.entidade = new EntidadeDTO();
        this.diasVoluntariado = new ArrayList<DiasSemanaDTO>();
    }

}
