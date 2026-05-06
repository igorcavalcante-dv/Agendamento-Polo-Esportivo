package com.polodesportivo.agendamento.service;

import com.polodesportivo.agendamento.dto.AgendamentoDto;
import com.polodesportivo.agendamento.entity.Agendamento;
import com.polodesportivo.agendamento.entity.Pagamento;
import com.polodesportivo.agendamento.entity.Quadra;
import com.polodesportivo.agendamento.entity.Usuario;
import com.polodesportivo.agendamento.repository.AgendamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendamentoService {

    @Autowired
    private AgendamentoRepository repository;

    public Agendamento criarAgendamento(AgendamentoDto dto, Usuario user, Quadra quadra) {

        Pagamento pag = new Pagamento(dto.metodoPagamento(), false);

        Agendamento agendamento = new Agendamento(
                user, quadra, dto.data(), dto.hora(),
                dto.quantidadePessoas(), dto.equipamento(), pag
        );

        return repository.save(agendamento);
    }

    public List<Agendamento> listarTodos() {
        return repository.findAll();
    }

    public void cancelar(String id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Agendamento não encontrado");
        }
        repository.deleteById(id);
    }
}
