package br.com.fiap.techforgood.dto;

import br.com.fiap.techforgood.entity.DoacaoEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DoacaoDTO {
    private Long idDoacao;
    private Date dtDoacao;
    private Integer vlDoacao;
    private UsuarioDTO usuario;
    private EntidadeDTO entidade;

    public DoacaoDTO(DoacaoEntity doacaoEntity){
        this.idDoacao = doacaoEntity.getIdDoacao();
        this.dtDoacao = doacaoEntity.getDtDoacao();
        this.vlDoacao = doacaoEntity.getVlDoacao();
        this.usuario = new UsuarioDTO();
        this.entidade = new EntidadeDTO();
    }

}
