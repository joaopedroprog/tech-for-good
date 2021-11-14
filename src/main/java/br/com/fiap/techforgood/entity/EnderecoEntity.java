package br.com.fiap.techforgood.entity;

import br.com.fiap.techforgood.dto.EnderecoDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tb_endereco")
public class EnderecoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_endereco")
	private Long idEndereco;

	@Column(name = "ds_logradouro")
	private String dsLogradouro;

	@Column(name = "nr_numero")
	private String nrNumero;

	@Column(name = "ds_complemento")
	private String dsComplemento;

	@Column(name = "nr_cep")
	private String nrCep;
	
	@ManyToOne
	@JoinColumn(name="id_bairro")
	private BairroEntity bairro;

	public EnderecoEntity(EnderecoDTO enderecoDTO){
		this.idEndereco = enderecoDTO.getIdEndereco();
		this.dsLogradouro = enderecoDTO.getDsLogradouro();
		this.nrNumero = enderecoDTO.getNrNumero();
		this.dsComplemento = enderecoDTO.getDsComplemento();
		this.nrCep = enderecoDTO.getNrCep();
		bairro = new BairroEntity(enderecoDTO.getBairro());
	}

}
