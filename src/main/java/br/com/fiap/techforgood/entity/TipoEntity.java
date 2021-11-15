package br.com.fiap.techforgood.entity;

import br.com.fiap.techforgood.dto.BairroDTO;
import br.com.fiap.techforgood.dto.EntidadeDTO;
import br.com.fiap.techforgood.dto.TipoDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import javax.persistence.*;

@Entity
@Table(name = "tb_tipo")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TipoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTipo;

    private String dsTipo;

    public TipoDTO toDTO() {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(this, TipoDTO.class);
    }
}
