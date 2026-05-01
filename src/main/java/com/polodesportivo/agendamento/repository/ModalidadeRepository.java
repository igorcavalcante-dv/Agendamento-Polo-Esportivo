package com.polodesportivo.agendamento.repository;

import com.polodesportivo.agendamento.entity.Modalidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModalidadeRepository extends JpaRepository<Modalidade, String> {
}
