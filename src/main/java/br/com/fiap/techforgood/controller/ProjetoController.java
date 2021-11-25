package br.com.fiap.techforgood.controller;

import br.com.fiap.techforgood.dto.EntidadeDTO;
import br.com.fiap.techforgood.dto.ProjetoDTO;
import br.com.fiap.techforgood.service.ProjetoService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "Projeto", value = "projeto")
public class ProjetoController {

    @Autowired
    private ProjetoService projetoService;

    @ResponseBody
    @PostMapping("/cadastro-projeto")
    public ResponseEntity createProjeto(@RequestBody ProjetoDTO projetoDTO) {

        try {
            return ResponseEntity.status(HttpStatus.OK).body(projetoService.createProjeto(projetoDTO));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao cadastrar projeto!");
        }
    }


}
