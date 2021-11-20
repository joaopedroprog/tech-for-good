package br.com.fiap.techforgood.entity;

import br.com.fiap.techforgood.dto.UsuarioDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tb_usuario")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idUsuario;
    private String nmUsuario;
    private Date dtNascimento;
    private String nrCpf;
    private String nmEmail;
    private String dsSenha;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idEndereco")
    private EnderecoEntity endereco;

    @ManyToMany(mappedBy = "usuarios")
    private List<ProjetoEntity> projetos = new ArrayList<>();

    public UsuarioDTO toDTO() {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(this, UsuarioDTO.class);
    }

}
