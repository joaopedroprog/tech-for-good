package br.com.fiap.techforgood.controller;

import br.com.fiap.techforgood.dto.UsuarioDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.techforgood.service.UsuarioService;

@RestController
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@ResponseBody
    @PostMapping("/usuario")
    public ResponseEntity<?> createUsuario(@RequestBody UsuarioDTO usuarioDTO) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(this.usuarioService.createUsuario(usuarioDTO));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao cadastrar usuario!");
        }
        
    }
    
}
