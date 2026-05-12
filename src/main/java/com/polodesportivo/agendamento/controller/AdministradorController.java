package com.polodesportivo.agendamento.controller;

import com.polodesportivo.agendamento.dto.AdministradorDto;
import com.polodesportivo.agendamento.entity.Administrador;
import com.polodesportivo.agendamento.service.AdministradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdministradorController {

    @Autowired
    private AdministradorService service;

    @PostMapping("/cadastrar")
    public ResponseEntity<Administrador> criarAdmin(@RequestBody AdministradorDto dto){
        Administrador adminSalvo = service.cadastrar(dto);
        return ResponseEntity.ok(adminSalvo);
    }

    @GetMapping
    public ResponseEntity<List<Administrador>> listar(){
        return ResponseEntity.ok(service.listarTodos());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Administrador> deletarAdmin(@PathVariable Long id){
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
