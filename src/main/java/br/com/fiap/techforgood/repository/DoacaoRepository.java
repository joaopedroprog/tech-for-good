package br.com.fiap.techforgood.repository;

import br.com.fiap.techforgood.entity.DoacaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoacaoRepository extends JpaRepository<DoacaoEntity, Long> {

    @Query(value="select * from tb_doacao where id_usuario = :idUsuario", nativeQuery=true)
    List<DoacaoEntity> buscaIdUsuario(Long idUsuario);

    @Query(value="select * from tb_doacao where id_entidade = :idEntidade", nativeQuery=true)
    List<DoacaoEntity> buscaIdEntidade(Long idEntidade);
}
