package br.com.fiap.techforgood.entity;

import br.com.fiap.techforgood.dto.EnderecoDTO;
import br.com.fiap.techforgood.dto.EventoDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tb_endereco")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EnderecoEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idEndereco;

    private String dsLogradouro;

    private Integer nrNumero;

    private String dsComplemento;

    private String nrCep;

    @ManyToOne
    @JoinColumn(name = "id_bairro")
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
