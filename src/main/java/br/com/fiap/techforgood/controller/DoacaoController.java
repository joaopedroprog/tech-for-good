package br.com.fiap.techforgood.controller;

import br.com.fiap.techforgood.dto.DoacaoDTO;
import br.com.fiap.techforgood.dto.EntidadeDTO;
import br.com.fiap.techforgood.service.DoacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DoacaoController {

    @Autowired
    private DoacaoService doacaoService;

    @ResponseBody
    @PostMapping("/doacao")
    public ResponseEntity realizarDoacao(@RequestBody DoacaoDTO doacaoDTO) {

        try {
            return ResponseEntity.status(HttpStatus.OK).body(doacaoService.realizarDoacao(doacaoDTO));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao realizar doação!");
        }
    }

    @ResponseBody
    @GetMapping("/get-doacao-usuario/{idUsuario}")
    public ResponseEntity getDoacaoUsuario(@PathVariable Long idUsuario) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(doacaoService.getDoacaoUsuario(idUsuario));

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao buscar entidade!");
        }
    }

    @ResponseBody
    @GetMapping("/get-doacao-entidade/{idEntidade}")
    public ResponseEntity getDoacaoEntidade(@PathVariable Long idEntidade) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(doacaoService.getDoacaoEntidade(idEntidade));

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao buscar entidade!");
        }
    }
}
