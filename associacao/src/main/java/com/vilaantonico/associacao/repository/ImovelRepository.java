package com.vilaantonico.associacao.repository;

import com.vilaantonico.associacao.domain.Imovel;
import com.vilaantonico.associacao.domain.enums.TipoImovelEnum;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ImovelRepository extends JpaRepository<Imovel, Long> {

    List<Imovel> findByTipo(TipoImovelEnum tipo);

    List<Imovel> findByEnderecoId(Long enderecoId);
}