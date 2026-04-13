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
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "local")
    private String local;

    @Column(name = "dataInicio")
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private LocalDateTime dataInicio;

    @Column(name = "dataFinal")
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private LocalDateTime dataFinal;

    @Column(name = "organizador")
    private String organizador;

    @Column(name = "status")
    private TipoEventoEnum status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
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

    public String getOrganizador() {
        return organizador;
    }

    public void setOrganizador(String organizador) {
        this.organizador = organizador;
    }

    public TipoEventoEnum getStatus() {
        return status;
    }

    public void setStatus(TipoEventoEnum status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", local='" + local + '\'' +
                ", dataInicio=" + dataInicio +
                ", dataFinal=" + dataFinal +
                ", organizador='" + organizador + '\'' +
                ", status=" + status +
                '}';
    }
}
