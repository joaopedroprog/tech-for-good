package br.com.fiap.techforgood.entity;

import br.com.fiap.techforgood.dto.BairroDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tb_bairro")
public class BairroEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_bairro")
	private Long idBairro;

	@Column(name = "ds_bairro")
	private String dsBairro;

	public BairroEntity(BairroDTO bairroDTO){
		this.idBairro = bairroDTO.getIdBairro();
		this.dsBairro = bairroDTO.getDsBairro();
	}

}
