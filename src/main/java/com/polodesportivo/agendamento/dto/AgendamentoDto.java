package com.polodesportivo.agendamento.dto;

import java.time.LocalDate;
import java.time.LocalTime;

public record AgendamentoDto(
        Long usuarioId,
        Long quadraId,
        LocalDate data,
        LocalTime hora,
        int quantidadePessoas,
        boolean equipamento,
        String metodoPagamento
){}

