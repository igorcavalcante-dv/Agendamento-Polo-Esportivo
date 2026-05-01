package com.polodesportivo.agendamento.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public record ModalidadeDto(
        @NotBlank String nome,
        @Positive double valorHora,
        @Positive double valorEquipamento
) {}
