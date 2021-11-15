package br.com.fiap.techforgood.service;

import br.com.fiap.techforgood.dto.DoacaoDTO;
import br.com.fiap.techforgood.dto.EventoDTO;
import br.com.fiap.techforgood.entity.DoacaoEntity;
import br.com.fiap.techforgood.entity.EventoEntity;
import br.com.fiap.techforgood.repository.DoacaoRepository;
import br.com.fiap.techforgood.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventoService {

    @Autowired
    private EventoRepository eventoRepository;

    public String cadastrarEvento(EventoDTO eventoDTO) {
        eventoRepository.save(eventoDTO.toEntity()).toDTO();
        return "Evento cadastrado com sucesso!";
    }

    public List<EventoEntity> getEventoEntidade(Long idEntidade) {
        List<EventoEntity> lista = eventoRepository.buscaEvento(idEntidade);
        return lista;
    }

    public List<EventoEntity> getEventos() {
        List<EventoEntity> lista = eventoRepository.findAll();
        return lista;
    }
}
