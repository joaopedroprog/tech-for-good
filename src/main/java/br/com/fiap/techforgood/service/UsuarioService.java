package br.com.fiap.techforgood.service;

import br.com.fiap.techforgood.dto.UsuarioDTO;
import br.com.fiap.techforgood.entity.UsuarioEntity;
import br.com.fiap.techforgood.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	public UsuarioDTO createUsuario(UsuarioDTO usuarioDTO) {
		return this.usuarioRepository.save(usuarioDTO.toEntity()).toDTO();
	}

}
