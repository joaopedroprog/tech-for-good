package br.com.fiap.techforgood.service;

import br.com.fiap.techforgood.dto.EntidadeDTO;
import br.com.fiap.techforgood.entity.EntidadeEntity;
import br.com.fiap.techforgood.repository.EntidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EntidadeService {

    @Autowired
    private EntidadeRepository entidadeRepository;

    public EntidadeDTO createEntidade(EntidadeDTO entidadeDTO) {
        return entidadeRepository.save(entidadeDTO.toEntity()).toDTO();
    }


    public EntidadeEntity getEntidade(Long idEntidade) {
        Optional<EntidadeEntity> optional = entidadeRepository.findById(idEntidade);
        return optional.get();
    }

//    public String updateEntidade(EntidadeDTO entidadeDTO, Long idEntidade) {
//        Optional<EntidadeEntity> entidadeEntity = getEntidade(idEntidade);
//
//        EntidadeEntity entidadeConvertida = new EntidadeEntity(entidadeDTO);
//        entidadeEntity = entidadeConvertida;
//        entidadeRepository.save(entidadeEntity);
//
//        return "Alteração realizada com sucesso";
//    }

    public String deleteEntidade(Long idEntidade) {
        entidadeRepository.deleteById(idEntidade);
        return "Exclusão realizada com sucesso";
    }
}
