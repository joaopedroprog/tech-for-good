package br.com.fiap.techforgood.service;

import br.com.fiap.techforgood.dto.DoacaoDTO;
import br.com.fiap.techforgood.entity.DoacaoEntity;
import br.com.fiap.techforgood.entity.EntidadeEntity;
import br.com.fiap.techforgood.repository.DoacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoacaoService {

    @Autowired
    private DoacaoRepository doacaoRepository;

    public String realizarDoacao(DoacaoDTO doacaoDTO) {
        DoacaoDTO doacao = doacaoDTO;
        doacaoRepository.save(doacaoDTO.toEntity()).toDTO();
        return "Doação realizada com sucesso!";
    }

    public List<DoacaoEntity> getDoacaoUsuario(Long idUsuario) {
        List<DoacaoEntity> lista = doacaoRepository.buscaIdUsuario(idUsuario);
        return lista;
    }

    public List<DoacaoEntity> getDoacaoEntidade(Long idEntidade) {
        List<DoacaoEntity> lista = doacaoRepository.buscaIdEntidade(idEntidade);
        return lista;
    }

}
