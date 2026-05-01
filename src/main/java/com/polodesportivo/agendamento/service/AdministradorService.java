package com.polodesportivo.agendamento.service;

import com.polodesportivo.agendamento.dto.AdministradorDto;
import com.polodesportivo.agendamento.entity.Administrador;
import com.polodesportivo.agendamento.repository.AdministradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministradorService {

    @Autowired
    private AdministradorRepository repository;

    public Administrador cadastrar(AdministradorDto dto){
        if(repository.findByCnpj(dto.cnpj()) != null){
            throw new RuntimeException("Este CNPJ já está cadastrado");
        }

        Administrador novoAdmin = new Administrador(
                dto.nomeDono(),
                dto.nomeEstabelecimento(),
                dto.cnpj(),
                dto.telefone(),
                dto.email()
        );

        return repository.save(novoAdmin);
    }

    public List<Administrador> listarTodos(){
        return repository.findAll();
    }
}
