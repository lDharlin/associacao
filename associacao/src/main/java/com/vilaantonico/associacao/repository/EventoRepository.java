package com.vilaantonico.associacao.repository;

import com.vilaantonico.associacao.domain.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento, Long> {
}
