package br.com.fiap.techforgood.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.techforgood.entity.EnderecoEntity;
import br.com.fiap.techforgood.service.EnderecoService;

@RestController
public class EnderecoController {
	
	@Autowired
	private EnderecoService enderecoService;
	
	@ResponseBody
    @PostMapping("/endereco")
    public ResponseEntity createEndereco(@RequestBody EnderecoEntity enderecoEntity) {

        try {
            return ResponseEntity.status(HttpStatus.OK).body(this.enderecoService.createEndereco(enderecoEntity));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao cadastrar bairro!");
        }
        
    }
    
}
