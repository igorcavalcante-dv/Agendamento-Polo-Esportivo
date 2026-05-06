package com.polodesportivo.agendamento.service;

import com.polodesportivo.agendamento.dto.PagamentoDto;
import com.polodesportivo.agendamento.entity.Pagamento;
import com.polodesportivo.agendamento.repository.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagamentoService {
    @Autowired
    private PagamentoRepository repository;

    public Pagamento criar(PagamentoDto dto){
        Pagamento pagamento = new Pagamento(
                dto.metodo(),
                dto.confirmado()
        );
        return repository.save(pagamento);
    }

    public void deletaPagamento(String id){
        repository.deleteById(id);
    }

}
