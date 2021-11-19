package br.com.fiap.techforgood.repository;

import br.com.fiap.techforgood.entity.DiasSemanaEntity;
import br.com.fiap.techforgood.entity.ProjetoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiasSemanaRepository  extends JpaRepository<DiasSemanaEntity, Long> {
}
