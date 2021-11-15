package br.com.fiap.techforgood.entity;

import br.com.fiap.techforgood.dto.BairroDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tb_bairro")
public class BairroEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idBairro;
	private String dsBairro;

	public BairroDTO toDTO() {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(this, BairroDTO.class);
	}

}
