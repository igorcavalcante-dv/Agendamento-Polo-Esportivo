package com.polodesportivo.agendamento.controller;

import com.polodesportivo.agendamento.dto.PagamentoDto;
import com.polodesportivo.agendamento.entity.Pagamento;
import com.polodesportivo.agendamento.service.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pagamentos")
public class PagamentoController {
    @Autowired
    private PagamentoService service;

    @PostMapping
    public ResponseEntity<Pagamento> criar(@RequestBody PagamentoDto dto){
        return ResponseEntity.ok(service.criar(dto));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> estornarPagamento(@PathVariable String id){
        service.deletaPagamento(id);
        return ResponseEntity.noContent().build();
    }
}
