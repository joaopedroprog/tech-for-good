package br.com.fiap.techforgood.entity;

import br.com.fiap.techforgood.dto.BairroDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tb_bairro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BairroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBairro;
    private String dsBairro;

    public BairroEntity(BairroDTO bairroDTO){
        this.idBairro = bairroDTO.getIdBairro();
        this.dsBairro = bairroDTO.getDsBairro();
    }
}
