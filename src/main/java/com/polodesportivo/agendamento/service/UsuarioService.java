package com.polodesportivo.agendamento.service;

import com.polodesportivo.agendamento.dto.UsuarioDto;
import com.polodesportivo.agendamento.entity.Usuario;
import com.polodesportivo.agendamento.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public Usuario cadastrar(UsuarioDto dto){
        if(repository.findByEmail(dto.email()) != null){
        throw new RuntimeException("Email já cadastrado!");
        }

        Usuario novoUsuario = new Usuario(
                dto.nome(),
                dto.cpf(),
                dto.telefone(),
                dto.email(),
                dto.senha()
        );

        return repository.save(novoUsuario);
    }

    public List<Usuario> listarTodos(){
        return repository.findAll();
    }

    public void deletarUsuario(String id){
        if(!repository.existsById(id)){
            throw new RuntimeException("Usuário não encotrado");
        }
        repository.deleteById(id);
    }
}
