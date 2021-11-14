package br.com.fiap.techforgood.dto;

import br.com.fiap.techforgood.entity.EnderecoEntity;
import br.com.fiap.techforgood.entity.UsuarioEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EnderecoDTO {

    private Long idEndereco;
    private String dsLogradouro;
    private Integer nrNumero;
    private String dsComplemento;
    private String nrCep;
    private BairroDTO bairro;
    private EntidadeDTO entidade;

    public EnderecoDTO(EnderecoEntity enderecoEntity){
        this.idEndereco = enderecoEntity.getIdEndereco();
        this.dsLogradouro = enderecoEntity.getDsLogradouro();
        this.nrNumero = enderecoEntity.getNrNumero();
        this.dsComplemento = enderecoEntity.getDsComplemento();
        this.nrCep = enderecoEntity.getNrCep();
        bairro = new BairroDTO();
        entidade = new EntidadeDTO();
    }

}
