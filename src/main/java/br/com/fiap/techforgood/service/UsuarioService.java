package br.com.fiap.techforgood.service;

import br.com.fiap.techforgood.dto.UsuarioDTO;
import br.com.fiap.techforgood.entity.UsuarioEntity;
import br.com.fiap.techforgood.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	public UsuarioDTO createUsuario(UsuarioDTO usuarioDTO) {
		return this.usuarioRepository.save(usuarioDTO.toEntity()).toDTO();
	}

	public UsuarioDTO getUsuario(Long idUsuario) throws Exception {
		return usuarioRepository.findById(idUsuario).get().toDTO();
	}



	public String  deleteUsuario(Long idUsuario) {
		this.usuarioRepository.deleteById(idUsuario);
		return "Usuário excluído com sucesso";
	}

	public UsuarioDTO updateUsuario(Long idUsuario, UsuarioDTO usuarioDTO) {
		 UsuarioEntity usuarioEntity = this.usuarioRepository.findById(idUsuario).get();
		if(usuarioEntity != null) {
			usuarioEntity.setNmUsuario(usuarioDTO.getNmUsuario());
			usuarioEntity.setNrCpf(usuarioDTO.getNrCpf());
			usuarioEntity.setDtNascimento(usuarioDTO.getDtNascimento());
			usuarioEntity.setNmEmail(usuarioDTO.getNmEmail());
			usuarioEntity.setDsSenha(usuarioDTO.getDsSenha());
			usuarioEntity.getEndereco().setBairro(usuarioDTO.getEndereco().getBairro().toEntity());
			usuarioEntity.getEndereco().setDsLogradouro(usuarioDTO.getEndereco().getDsLogradouro());
			usuarioEntity.getEndereco().setNrNumero(usuarioDTO.getEndereco().getNrNumero());
			usuarioEntity.getEndereco().setDsComplemento(usuarioDTO.getEndereco().getDsComplemento());
			usuarioEntity.getEndereco().setNrCep(usuarioDTO.getEndereco().getNrCep());
		}
		return this.usuarioRepository.save(usuarioEntity).toDTO();
	}
}
