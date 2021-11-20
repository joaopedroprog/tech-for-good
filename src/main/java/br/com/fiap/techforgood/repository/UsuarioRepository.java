package br.com.fiap.techforgood.repository;

import br.com.fiap.techforgood.entity.DoacaoEntity;
import br.com.fiap.techforgood.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

    @Query(value="insert into tb_usuario_proj(id_usuario, id_projeto) values(:idUsuario, :idProjeto)", nativeQuery=true)
    void participarProjeto(Long idUsuario, Long idProjeto);


}
