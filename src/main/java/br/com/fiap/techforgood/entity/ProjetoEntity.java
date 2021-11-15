package br.com.fiap.techforgood.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tb_projeto")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjetoEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idProjeto;

    private String nmProjeto;

    private String dsProjeto;

    private Integer nrVoluntario;

    private Date dtInicio;

    private Date hrInicio;

    private Date hrFim;

    @ManyToOne
    @JoinColumn(name = "id_entidade")
    private EntidadeEntity entidade;

//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "tb_usuario_proj",
//            joinColumns = @JoinColumn(name = "id_projeto"),
//            inverseJoinColumns = @JoinColumn(name = "id_usuario", insertable = true, updatable = true)
//    )
//    private List<UsuarioEntity> voluntarios;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "tb_proj_dia",
            joinColumns = @JoinColumn(name = "id_projeto"),
            inverseJoinColumns = @JoinColumn(name = "id_dias_semana", insertable = false, updatable = false)
    )
    private List<DiasSemanaEntity> diasVoluntariado;


}
