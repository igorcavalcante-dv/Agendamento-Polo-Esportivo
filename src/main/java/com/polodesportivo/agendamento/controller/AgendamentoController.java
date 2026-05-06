package com.polodesportivo.agendamento.controller;

import com.polodesportivo.agendamento.dto.AgendamentoDto;
import com.polodesportivo.agendamento.entity.Agendamento;
import com.polodesportivo.agendamento.service.AgendamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/agendamentos")
public class AgendamentoController {

    @Autowired
    private AgendamentoService service;

    @PostMapping
    public ResponseEntity<Agendamento> agendar(@RequestBody AgendamentoDto dto){
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> cancelar(@PathVariable String id){
        service.cancelar(id);
        return ResponseEntity.noContent().build();
    }
}
