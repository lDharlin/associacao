package com.vilaantonico.associacao.repository;

import com.vilaantonico.associacao.domain.Imovel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImovelRepository extends JpaRepository<Imovel, Long> {
}
