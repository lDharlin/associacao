package com.vilaantonico.associacao.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.vilaantonico.associacao.domain.enums.TipoEventoEnum;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "evento")
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_evento")
    private Long idEvento;

    @Column(name = "nome", length = 50, nullable = false)
    private String nome;

    @Column(name = "descricao", length = 100, nullable = false)
    private String descricao;

    @Column(name = "data_inicio", nullable = false)
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private LocalDateTime dataInicio;

    @Column(name = "data_final", nullable = false)
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private LocalDateTime dataFinal;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private TipoEventoEnum status;

    @ManyToOne
    @JoinColumn(name = "organizador_id")
    private Pessoa organizador;

    public Long getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(Long idEvento) {
        this.idEvento = idEvento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDateTime dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDateTime getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(LocalDateTime dataFinal) {
        this.dataFinal = dataFinal;
    }

    public TipoEventoEnum getStatus() {
        return status;
    }

    public void setStatus(TipoEventoEnum status) {
        this.status = status;
    }

    public Pessoa getOrganizador() {
        return organizador;
    }

    public void setOrganizador(Pessoa organizador) {
        this.organizador = organizador;
    }

}
