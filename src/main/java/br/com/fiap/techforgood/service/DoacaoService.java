package br.com.fiap.techforgood.service;

import br.com.fiap.techforgood.dto.DoacaoDTO;
import br.com.fiap.techforgood.dto.EntidadeDTO;
import br.com.fiap.techforgood.dto.UsuarioDTO;
import br.com.fiap.techforgood.entity.DoacaoEntity;
import br.com.fiap.techforgood.entity.EntidadeEntity;
import br.com.fiap.techforgood.entity.UsuarioEntity;
import br.com.fiap.techforgood.repository.DoacaoRepository;
import br.com.fiap.techforgood.repository.EntidadeRepository;
import br.com.fiap.techforgood.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DoacaoService {

    @Autowired
    private DoacaoRepository doacaoRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private EntidadeRepository entidadeRepository;

    public DoacaoDTO realizarDoacao(Long idUsuario, Long idEntidade, Integer valorDoacao) {
        UsuarioEntity usuarioEntity = usuarioRepository.findById(idUsuario).get();
        EntidadeEntity entidadeEntity = entidadeRepository.findById(idEntidade).get();
        DoacaoEntity doacaoEntity = new DoacaoEntity();
        doacaoEntity.setUsuario(usuarioEntity);
        doacaoEntity.setEntidade(entidadeEntity);
        doacaoEntity.setVlDoacao(valorDoacao);
        return doacaoRepository.save(doacaoEntity).toDTO();
    }

    public List<DoacaoDTO> getDoacaoUsuario(Long idUsuario) {
        List<DoacaoEntity> list  = this.doacaoRepository.buscaIdUsuario(idUsuario);
        return list.stream().map(x -> x.toDTO()).collect(Collectors.toCollection(ArrayList:: new));
    }

    public List<DoacaoDTO> getDoacaoEntidade(Long idEntidade) {
        List<DoacaoEntity> list  = this.doacaoRepository.buscaIdUsuario(idEntidade);
        return list.stream().map(x -> x.toDTO()).collect(Collectors.toCollection(ArrayList:: new));
    }

}
