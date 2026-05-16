package com.vilaantonico.associacao.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Cargo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cargo_nome", length = 100, nullable = false)
    private String nome;

    @Column(name = "cargo_descricao", length = 256, nullable = false)
    private String descricao;
}