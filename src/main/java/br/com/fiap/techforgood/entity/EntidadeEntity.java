package br.com.fiap.techforgood.entity;

import br.com.fiap.techforgood.dto.EnderecoDTO;
import br.com.fiap.techforgood.dto.EntidadeDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tb_usuario")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EntidadeEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idEntidade;

    private String nmEntidade;

    private String dsEntidade;

    private Integer nrVoluntarios;

    private String nrCnpj;

    @ManyToOne
    @JoinColumn(name = "id_endereco")
    private EnderecoEntity endereco;

    @ManyToOne
    @JoinColumn(name = "id_tipo")
    private TipoEntity tipo;

    public EntidadeEntity(EntidadeDTO entidadeDTO){
        this.idEntidade = entidadeDTO.getIdEntidade();
        this.nmEntidade = entidadeDTO.getNmEntidade();
        this.dsEntidade = entidadeDTO.getDsEntidade();
        this.nrVoluntarios = entidadeDTO.getNrVoluntarios();
        this.nrCnpj = entidadeDTO.getNrCnpj();
        endereco = new EnderecoEntity(entidadeDTO.getEndereco());
        tipo = new TipoEntity(entidadeDTO.getTipo());
    }

}
