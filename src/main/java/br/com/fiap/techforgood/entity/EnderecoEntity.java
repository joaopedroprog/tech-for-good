package br.com.fiap.techforgood.entity;

import br.com.fiap.techforgood.dto.EnderecoDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tb_endereco")
public class EnderecoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEndereco;
	private String dsLogradouro;
	private String nrNumero;
	private String dsComplemento;
	private String nrCep;
	
	@ManyToOne
	@JoinColumn(name="idBairro")
	private BairroEntity bairro;

	public EnderecoDTO toDTO() {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(this, EnderecoDTO.class);
	}

}
