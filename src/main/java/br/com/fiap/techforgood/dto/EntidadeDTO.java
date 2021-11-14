package br.com.fiap.techforgood.dto;

import br.com.fiap.techforgood.entity.EntidadeEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EntidadeDTO {

    private Long idEntidade;
    private String nmEntidade;
    private String dsEntidade;
    private Integer nrVoluntarios;
    private String nrCnpj;
    private EnderecoDTO endereco;
    private TipoDTO tipo;

    public EntidadeDTO(EntidadeEntity entidadeEntity){
        this.idEntidade = entidadeEntity.getIdEntidade();
        this.nmEntidade = entidadeEntity.getNmEntidade();
        this.dsEntidade = entidadeEntity.getDsEntidade();
        this.nrVoluntarios = entidadeEntity.getNrVoluntarios();
        this.nrCnpj = entidadeEntity.getNrCnpj();
        this.endereco = new EnderecoDTO();
        this.tipo = new TipoDTO();
    }
}
