package com.polodesportivo.agendamento.controller;

import com.polodesportivo.agendamento.dto.QuadraDto;
import com.polodesportivo.agendamento.entity.Quadra;
import com.polodesportivo.agendamento.service.QuadraService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quadras")
public class QuadraController {

    @Autowired
    private QuadraService service;

    @PostMapping
    public ResponseEntity<Quadra> cadastrar(@RequestBody @Valid QuadraDto dto){
        return ResponseEntity.ok(service.salvar(dto));
    }

    @GetMapping
    public ResponseEntity<List<Quadra>> listar(){
        return ResponseEntity.ok(service.listarTodos());
    }
}
