package com.polodesportivo.agendamento.dto;

import java.time.LocalDate;
import java.time.LocalTime;

public record AgendamentoDto(
        String usuarioId,
        String quadraId,
        LocalDate data,
        LocalTime hora,
        int quantidadePessoas,
        boolean equipamento,
        String metodoPagamento
){}

