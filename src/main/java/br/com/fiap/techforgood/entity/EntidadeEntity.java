package br.com.fiap.techforgood.entity;

import br.com.fiap.techforgood.dto.EntidadeDTO;
import br.com.fiap.techforgood.dto.UsuarioDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import javax.persistence.*;

@Entity
@Table(name = "tb_entidade")
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

    private String nmEmail;

    private String dsSenha;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_endereco")
    private EnderecoEntity endereco;

    @ManyToOne
    @JoinColumn(name = "id_tipo")
    private TipoEntity tipo;

    public EntidadeDTO toDTO() {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(this, EntidadeDTO.class);
    }
}
