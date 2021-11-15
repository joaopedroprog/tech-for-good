package br.com.fiap.techforgood.dto;

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

}
