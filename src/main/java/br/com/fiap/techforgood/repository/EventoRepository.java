package br.com.fiap.techforgood.repository;

import br.com.fiap.techforgood.entity.DoacaoEntity;
import br.com.fiap.techforgood.entity.EventoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventoRepository extends JpaRepository<EventoEntity, Long> {

    @Query(value="select * from tb_evento where id_entidade = :idEntidade", nativeQuery=true)
    List<EventoEntity> buscaEvento(Long idEntidade);

}
