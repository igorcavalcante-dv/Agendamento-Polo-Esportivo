package com.polodesportivo.agendamento.dto;

public record UsuarioDto(
        String nome,
        String cpf,
        String telefone,
        String email,
        String senha
) {}
