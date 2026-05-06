package com.polodesportivo.agendamento.dto;

public record AdministradorDto(
        String nomeDono,
        String nomeEstabelecimento,
        String cnpj,
        String telefone,
        String email,
        String senha)
{}
