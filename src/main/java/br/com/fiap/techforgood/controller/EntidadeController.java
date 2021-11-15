package br.com.fiap.techforgood.controller;

import br.com.fiap.techforgood.dto.EntidadeDTO;
import br.com.fiap.techforgood.service.EntidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class EntidadeController {

    @Autowired
    private EntidadeService entidadeService;

    @ResponseBody
    @PostMapping("/cadastro-entidade")
    public ResponseEntity createEntidade(@RequestBody EntidadeDTO entidadeDTO) {

        try {
            return ResponseEntity.status(HttpStatus.OK).body(entidadeService.createEntidade(entidadeDTO));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao cadastrar entidade!");
        }
    }

    @ResponseBody
    @GetMapping("/get-entidade/{idEntidade}")
    public ResponseEntity getEntidade(@PathVariable Long idEntidade) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(entidadeService.getEntidade(idEntidade).toDTO());

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao buscar entidade!");
        }
    }

//    @PutMapping("/update-entidade/{idEntidade}")
//    public ResponseEntity updateEntidade(@RequestBody EntidadeDTO entidadeDTO, @PathVariable Long idEntidade){
//        String retorno = entidadeService.updateEntidade(entidadeDTO, idEntidade);
//        return ResponseEntity.ok().body(retorno);
//    }

    @DeleteMapping("/delete-entidade/{idEntidade}")
    public ResponseEntity deleteEntidade(@PathVariable Long idEntidade) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(entidadeService.deleteEntidade(idEntidade));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao excluir usuário");
        }
    }
}
