package br.com.fiap.techforgood.entity;

import br.com.fiap.techforgood.dto.DoacaoDTO;
import br.com.fiap.techforgood.dto.EventoDTO;
import lombok.Data;
import org.modelmapper.ModelMapper;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_evento")
@Data
public class EventoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEvento;

    private String nmEvento;

    private String dsEvento;

    private Date dtEvento;

    @ManyToOne
    @JoinColumn(name = "id_entidade")
    private EntidadeEntity entidade;

    public EventoDTO toDTO() {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(this, EventoDTO.class);
    }

}
