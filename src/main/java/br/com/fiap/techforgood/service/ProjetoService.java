package br.com.fiap.techforgood.service;

import br.com.fiap.techforgood.dto.DiasSemanaDTO;
import br.com.fiap.techforgood.dto.ProjetoDTO;
import br.com.fiap.techforgood.entity.DiasSemanaEntity;
import br.com.fiap.techforgood.entity.ProjetoEntity;
import br.com.fiap.techforgood.repository.DiasSemanaRepository;
import br.com.fiap.techforgood.repository.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjetoService {

    @Autowired
    private DiasSemanaRepository diasSemanaRepository;
    @Autowired
    private ProjetoRepository projetoRepository;


    public String createProjeto(ProjetoDTO projetoDTO) {
        ProjetoEntity entity = projetoDTO.toEntity();
//        entity.setNmProjeto(projetoDTO.getNmProjeto());
//        entity.setDsProjeto(projetoDTO.getDsProjeto());
//        entity.setNrVoluntario(projetoDTO.getNrVoluntario());
//        entity.setDtInicio(projetoDTO.getDtInicio());
//        entity.setHrInicio(projetoDTO.getHrInicio());
//        entity.setHrFim(projetoDTO.getHrFim());
//        entity.getEntida(projetoDTO.getEntidade().getIdEntidade());
//
//        String nmProjeto = projetoDTO.getNmProjeto();
//        String dsProjeto = projetoDTO.getDsProjeto();
//        Integer nrVoluntario = projetoDTO.getNrVoluntario();
//        Date dtInicio = projetoDTO.getDtInicio();
//        Date hrInicio = projetoDTO.getHrInicio();
//        Date hrFim = projetoDTO.getHrFim();
//        Integer id
//        entity.setDtSolicitacao(solicExame.getDtSolicitacao());
//        entity.setDsIndicacaoClin(solicExame.getDsIndicacaoClin());
//        entity.setProntuario(prontuarioEntity);
//        entity.setPaciente(pacienteEntity);
//        entity.setMedico(medicoEntity);

        List<DiasSemanaEntity> diasEntity = new ArrayList<>();
        for (DiasSemanaDTO listaDias : projetoDTO.getDiasVoluntariado()) {
            Long id = listaDias.getIdDiasSemana();
            DiasSemanaEntity diasSemanaEntity = diasSemanaRepository.findById(id).get();
            diasEntity.add(diasSemanaEntity);
        }
        entity.setDiasVoluntariado(diasEntity);
        projetoRepository.save(entity);
        return "ok";
    }

}
