package com.vilaantonico.associacao.domain;

import com.vilaantonico.associacao.domain.enums.TipoImovelEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "imovel")
public class Imovel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "imovel_descricao", nullable = false)
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "imovel_endereco_id")
    private Endereco endereco;

    @Enumerated(EnumType.STRING)
    private TipoImovelEnum tipo;

    public Imovel() {
    }

    public Imovel(String descricao, Endereco endereco, TipoImovelEnum tipo) {
        this.descricao = descricao;
        this.endereco = endereco;
        this.tipo = tipo;
    }
}