package br.com.fiap.techforgood.controller;

import br.com.fiap.techforgood.dto.EventoDTO;
import br.com.fiap.techforgood.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EventoController {

    @Autowired
    private EventoService eventoService;

    @ResponseBody
    @PostMapping("/evento")
    public ResponseEntity cadastrarEvento(@RequestBody EventoDTO eventoDTO) {

        try {
            return ResponseEntity.status(HttpStatus.OK).body(eventoService.cadastrarEvento(eventoDTO));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao realizar doação!");
        }
    }

    @ResponseBody
    @GetMapping("/get-evento-entidade/{idEntidade}")
    public ResponseEntity getEventoEntidade(@PathVariable Long idEntidade) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(eventoService.getEventoEntidade(idEntidade));

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao buscar eventos da entidade!");
        }
    }

    @ResponseBody
    @GetMapping("/get-evento")
    public ResponseEntity getEventos() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(eventoService.getEventos());

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao buscar eventos!");
        }
    }
}
