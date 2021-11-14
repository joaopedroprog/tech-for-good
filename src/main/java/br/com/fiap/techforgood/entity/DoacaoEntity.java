package br.com.fiap.techforgood.entity;

import br.com.fiap.techforgood.dto.DoacaoDTO;
import br.com.fiap.techforgood.dto.EnderecoDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_doacao")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DoacaoEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idDoacao;

    private Date dtDoacao;

    private Integer vlDoacao;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private UsuarioEntity usuario;

    @ManyToOne
    @JoinColumn(name = "id_entidade")
    private EntidadeEntity entidade;

    public DoacaoEntity(DoacaoDTO doacaoDTO){
        this.idDoacao = doacaoDTO.getIdDoacao();
        this.dtDoacao = doacaoDTO.getDtDoacao();
        this.vlDoacao = doacaoDTO.getVlDoacao();
        usuario = new UsuarioEntity(doacaoDTO.getUsuario());
        entidade = new EntidadeEntity(doacaoDTO.getEntidade());
    }

}
