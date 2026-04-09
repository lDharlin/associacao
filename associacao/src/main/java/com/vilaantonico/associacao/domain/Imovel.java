package com.vilaantonico.associacao.domain;

import com.vilaantonico.associacao.domain.enums.TipoImovelEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "imovel")
public class Imovel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "desc_imovel", nullable = false)
    private String descricao;

    @Column(name = "end_imovel", nullable = false, length = 156)
    private String endereco;

    @Enumerated(EnumType.STRING)
    private TipoImovelEnum tipo;


    public Imovel() {
    }

    public Imovel(String descricao, String endereco) {
        this.descricao = descricao;
        this.endereco = endereco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public TipoImovelEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoImovelEnum tipo) {
        this.tipo = tipo;
    }
}
