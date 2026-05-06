package com.vilaantonico.associacao.repository;

import com.vilaantonico.associacao.domain.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}

