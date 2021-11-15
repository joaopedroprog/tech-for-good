package br.com.fiap.techforgood.dto;

import br.com.fiap.techforgood.entity.DoacaoEntity;
import br.com.fiap.techforgood.entity.EventoEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

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

    public EventoEntity toEntity() {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(this, EventoEntity.class);
    }
}
