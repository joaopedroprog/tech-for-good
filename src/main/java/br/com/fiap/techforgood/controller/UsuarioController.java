package br.com.fiap.techforgood.controller;

import br.com.fiap.techforgood.dto.UsuarioDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.fiap.techforgood.service.UsuarioService;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;

    @PostMapping("/cadastrar")
    public ResponseEntity<?> createUsuario(@RequestBody UsuarioDTO usuarioDTO) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(this.usuarioService.createUsuario(usuarioDTO));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao cadastrar usuário!");
        }
        
    }

    @GetMapping("{idUsuario}")
    public ResponseEntity<?> getUsuario(@PathVariable Long idUsuario) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(this.usuarioService.getUsuario(idUsuario));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao buscar usuário");
        }
    }

    @PutMapping("{idUsuario}")
    public ResponseEntity<?> updateUsuario(@PathVariable Long idUsuario, @RequestBody UsuarioDTO usuarioDTO) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(this.usuarioService.updateUsuario(idUsuario, usuarioDTO));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao atualizar usuário!");
        }
    }

    @DeleteMapping("{idUsuario}")
    public ResponseEntity<?> deleteUsuario(@PathVariable Long idUsuario) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(this.usuarioService.deleteUsuario(idUsuario));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao excluir usuário!");
        }
    }

    @PutMapping("/participar-projeto")
    public ResponseEntity<?> participarProjeto(
            @RequestParam(name="idUsuario", required = true) Long idUsuario,
            @RequestParam(name="idProjeto", required = true) Long idProjeto
            ) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(this.usuarioService.participarProjeto(idUsuario, idProjeto));
        } catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao adicionar projeto para usuário");
        }
    }

}
