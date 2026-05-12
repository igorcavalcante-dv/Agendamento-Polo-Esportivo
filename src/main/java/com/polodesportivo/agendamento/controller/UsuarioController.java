package com.polodesportivo.agendamento.controller;

import com.polodesportivo.agendamento.dto.UsuarioDto;
import com.polodesportivo.agendamento.entity.Usuario;
import com.polodesportivo.agendamento.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @PostMapping
    public ResponseEntity<Usuario> criar(@RequestBody UsuarioDto dto){
        Usuario usuarioSalvo = service.cadastrar(dto);
        return ResponseEntity.ok(usuarioSalvo);
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> listar(){
        return ResponseEntity.ok(service.listarTodos());
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        service.deletarUsuario(id);
        return ResponseEntity.noContent().build();
    }
}
