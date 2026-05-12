package com.polodesportivo.agendamento.repository;

import com.polodesportivo.agendamento.entity.Quadra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuadraRepository extends JpaRepository<Quadra, Long> {
}
