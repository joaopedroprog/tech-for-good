package br.com.fiap.techforgood.service;

import br.com.fiap.techforgood.dto.EntidadeDTO;
import br.com.fiap.techforgood.entity.EntidadeEntity;
import br.com.fiap.techforgood.entity.UsuarioEntity;
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

    public EntidadeDTO updateEntidade(EntidadeDTO entidadeDTO, Long idEntidade) {
        EntidadeEntity entidadeEntity = this.entidadeRepository.findById(idEntidade).get();
        if(entidadeEntity != null) {
            entidadeEntity.setNmEntidade(entidadeDTO.getNmEntidade());
            entidadeEntity.setDsEntidade(entidadeDTO.getDsEntidade());
            entidadeEntity.setNrCnpj(entidadeDTO.getNrCnpj());
            entidadeEntity.setNrVoluntarios(entidadeDTO.getNrVoluntarios());
            entidadeEntity.setNmEmail(entidadeDTO.getNmEmail());
            entidadeEntity.setDsSenha(entidadeDTO.getDsSenha());
            entidadeEntity.getEndereco().setBairro(entidadeDTO.getEndereco().getBairro().toEntity());
            entidadeEntity.getEndereco().setDsLogradouro(entidadeDTO.getEndereco().getDsLogradouro());
            entidadeEntity.getEndereco().setNrNumero(entidadeDTO.getEndereco().getNrNumero());
            entidadeEntity.getEndereco().setDsComplemento(entidadeDTO.getEndereco().getDsComplemento());
            entidadeEntity.getEndereco().setNrCep(entidadeDTO.getEndereco().getNrCep());
            entidadeEntity.getTipo().setDsTipo(entidadeDTO.getTipo().getDsTipo());
        }
        return this.entidadeRepository.save(entidadeEntity).toDTO();
    }

    public String deleteEntidade(Long idEntidade) {
        entidadeRepository.deleteById(idEntidade);
        return "Exclusão realizada com sucesso";
    }
}
