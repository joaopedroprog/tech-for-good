package br.com.fiap.techforgood.dto;

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

}
