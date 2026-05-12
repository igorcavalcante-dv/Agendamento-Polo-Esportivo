package com.polodesportivo.agendamento.dto;

import jakarta.validation.constraints.NotBlank;

public record QuadraDto(
        @NotBlank(message = "O nome da quadra é obrigatorio")
        String nome,

        @NotBlank(message = "O ID da modalidade é obrigatoria")
        Long modalidadeId
) {}
