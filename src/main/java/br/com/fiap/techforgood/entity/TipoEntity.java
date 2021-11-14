package br.com.fiap.techforgood.entity;

import br.com.fiap.techforgood.dto.TipoDTO;
import br.com.fiap.techforgood.dto.UsuarioDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    public TipoEntity(TipoDTO tipoDTO){
        this.idTipo = tipoDTO.getIdTipo();
        this.dsTipo = tipoDTO.getDsTipo();
    }

}
