package com.polodesportivo.agendamento.service;

import com.polodesportivo.agendamento.dto.QuadraDto;
import com.polodesportivo.agendamento.entity.Modalidade;
import com.polodesportivo.agendamento.entity.Quadra;
import com.polodesportivo.agendamento.repository.ModalidadeRepository;
import com.polodesportivo.agendamento.repository.QuadraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuadraService {

    @Autowired
    private QuadraRepository repository;

    @Autowired
    private ModalidadeRepository modaliadadeRepository;

    public Quadra salvar(QuadraDto dto){
        Modalidade modalidade = modaliadadeRepository.findById(dto.modalidadeId())
                .orElseThrow(() -> new RuntimeException("Modalidade não encontrada"));

        Quadra novaQuadra = new Quadra(dto.nome(), modalidade);
        return repository.save(novaQuadra);
    }

    public List<Quadra> listarTodos(){
        return repository.findAll();
    }

    public void deletarQuadra(String id){
        if(!repository.existsById(id)){
            throw new RuntimeException("Quadra não encontrada");
        }
        repository.deleteById(id);
    }
}
