package br.com.fiap.techforgood.dto;


import br.com.fiap.techforgood.entity.EventoEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventoDTO {

    private Long idEvento;
    private String nmEvento;
    private String dsEvento;
    private Date dtEvento;
    private EntidadeDTO entidade;

    public EventoDTO(EventoEntity eventoEntity){
        this.idEvento = eventoEntity.getIdEvento();
        this.nmEvento = eventoEntity.getNmEvento();
        this.dsEvento = eventoEntity.getDsEvento();
        this.dtEvento = eventoEntity.getDtEvento();
        entidade = new EntidadeDTO();
    }
}
