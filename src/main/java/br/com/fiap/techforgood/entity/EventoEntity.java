package br.com.fiap.techforgood.entity;

import br.com.fiap.techforgood.dto.EventoDTO;
import br.com.fiap.techforgood.dto.UsuarioDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_evento")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventoEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idEvento;

    private String nmEvento;

    private String dsEvento;

    private Date dtEvento;

    @ManyToOne
    @JoinColumn(name = "id_entidade")
    private EntidadeEntity entidade;

    public EventoEntity(EventoDTO eventoDTO){
        this.idEvento = eventoDTO.getIdEvento();
        this.nmEvento = eventoDTO.getNmEvento();
        this.dsEvento = eventoDTO.getDsEvento();
        this.dtEvento = eventoDTO.getDtEvento();
        this.entidade = new EntidadeEntity(eventoDTO.getEntidade());

    }
}
