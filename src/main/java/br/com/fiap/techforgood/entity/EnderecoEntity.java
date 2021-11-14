package br.com.fiap.techforgood.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


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
	@JoinColumn(name="idBairro", referencedColumnName="idBairro")
	private BairroEntity bairro;

	public Long getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(Long idEndereco) {
		this.idEndereco = idEndereco;
	}

	public String getDsLogradouro() {
		return dsLogradouro;
	}

	public void setDsLogradouro(String dsLogradouro) {
		this.dsLogradouro = dsLogradouro;
	}

	public String getNrNumero() {
		return nrNumero;
	}

	public void setNrNumero(String nrNumero) {
		this.nrNumero = nrNumero;
	}

	public String getDsComplemento() {
		return dsComplemento;
	}

	public void setDsComplemento(String dsComplemento) {
		this.dsComplemento = dsComplemento;
	}

	public String getNrCep() {
		return nrCep;
	}

	public void setNrCep(String nrCep) {
		this.nrCep = nrCep;
	}

	public BairroEntity getBairro() {
		return bairro;
	}

	public void setBairro(BairroEntity bairro) {
		this.bairro = bairro;
	}
	

}
