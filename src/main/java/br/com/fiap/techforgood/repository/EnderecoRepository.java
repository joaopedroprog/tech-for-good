package br.com.fiap.techforgood.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import br.com.fiap.techforgood.entity.EnderecoEntity;

public interface EnderecoRepository extends JpaRepository<EnderecoEntity, Long> {

}
