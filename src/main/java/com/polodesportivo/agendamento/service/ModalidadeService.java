package com.polodesportivo.agendamento.service;

import com.polodesportivo.agendamento.dto.ModalidadeDto;
import com.polodesportivo.agendamento.entity.Modalidade;
import com.polodesportivo.agendamento.repository.ModalidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModalidadeService {
    @Autowired
    private ModalidadeRepository repository;

    private Modalidade salvar(ModalidadeDto dto){
        Modalidade modalidade = new Modalidade(
                dto.nome(),
                dto.valorHora(),
                dto.valorEquipamento()
        );
        return repository.save(modalidade);
    }

    public List<Modalidade> listarTodos(){
        return repository.findAll();
    }
}
