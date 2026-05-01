package com.polodesportivo.agendamento.controller;

import com.polodesportivo.agendamento.dto.AgendamentoDto;
import com.polodesportivo.agendamento.entity.Agendamento;
import com.polodesportivo.agendamento.service.AgendamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/agendamentos")
public class AgendamentoController {

    @Autowired
    private AgendamentoService service;

    @PostMapping
    public ResponseEntity<Agendamento> agendar(@RequestBody AgendamentoDto dto){
        return ResponseEntity.ok().build();
    }
}
