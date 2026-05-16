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

    @ManyToOne
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;

    @Enumerated(EnumType.STRING)
    private TipoImovelEnum tipo;

    @Column(name = "valor_estimado", nullable = false)
    private Double valorEstimado;

    public Imovel() {
    }

    public Imovel(String descricao, TipoImovelEnum tipo, Endereco endereco, Double valorEstimado) {
        this.descricao = descricao;
        this.tipo = tipo;
        this.endereco = endereco;
        this.valorEstimado = valorEstimado;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public TipoImovelEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoImovelEnum tipo) {
        this.tipo = tipo;
    }

    public Double getValorEstimado() {
        return valorEstimado;
    }

    public void setValorEstimado(Double valorEstimado) {
        this.valorEstimado = valorEstimado;
    }
}
