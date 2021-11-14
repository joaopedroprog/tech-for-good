package br.com.fiap.techforgood.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.techforgood.entity.EnderecoEntity;
import br.com.fiap.techforgood.repository.EnderecoRepository;

@Service
public class EnderecoService {
	
	@Autowired
	private EnderecoRepository enderecoRepository;

	public EnderecoEntity createEndereco(EnderecoEntity enderecoEntity) {
		return this.enderecoRepository.save(enderecoEntity);
	}

}
