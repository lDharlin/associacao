package com.vilaantonico.associacao.service;

import com.vilaantonico.associacao.domain.Evento;
import com.vilaantonico.associacao.repository.EventoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventoService {

    private final EventoRepository repository;

    public EventoService(EventoRepository repository) {
        this.repository = repository;
    }

    public Evento salvar(Evento evento) {
        if (evento.getDataInicio().isAfter(evento.getDataFinal())) {
            throw new IllegalArgumentException("Data fim não pode ser antes da data início");
        }
        return this.repository.save(evento);
    }

    public List<Evento> buscarTodos() {
        return this.repository.findAll();
    }

    public Evento buscarPorId(Long id) {
        return this.repository.findById(id).orElseThrow(() -> new RuntimeException("Evento não encontrado"));
    }

    public void atualizar(Long id,Evento novoEvento) {
        Evento evento = buscarPorId(id);
        evento.setNome(novoEvento.getNome());
       // evento.setLocal(novoEvento.getLocal());
        evento.setDataInicio(novoEvento.getDataInicio());
        evento.setDataFinal(novoEvento.getDataFinal());
        evento.setOrganizador(novoEvento.getOrganizador());
        evento.setStatus(novoEvento.getStatus());
        this.repository.save(evento);

    }

    public void deletar(Long id) {
        Evento evento = buscarPorId(id);
        this.repository.deleteById(id);

    }

}
