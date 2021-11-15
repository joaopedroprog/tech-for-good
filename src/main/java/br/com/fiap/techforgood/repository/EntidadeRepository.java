package br.com.fiap.techforgood.repository;

import br.com.fiap.techforgood.dto.EntidadeDTO;
import br.com.fiap.techforgood.entity.EntidadeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntidadeRepository  extends JpaRepository<EntidadeEntity, Long> {

}
