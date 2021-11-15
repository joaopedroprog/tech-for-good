package br.com.fiap.techforgood.entity;

import br.com.fiap.techforgood.dto.DoacaoDTO;
import br.com.fiap.techforgood.dto.EntidadeDTO;
import br.com.fiap.techforgood.dto.UsuarioDTO;
import lombok.Data;
import org.modelmapper.ModelMapper;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_doacao")
@Data
public class DoacaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDoacao;

    private Date dtDoacao;

    private Integer vlDoacao;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private UsuarioEntity usuario;

    @ManyToOne
    @JoinColumn(name = "id_entidade")
    private EntidadeEntity entidade;

    public DoacaoDTO toDTO() {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(this, DoacaoDTO.class);
    }

}
