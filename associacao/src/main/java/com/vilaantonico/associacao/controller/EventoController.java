package com.vilaantonico.associacao.controller;

import com.vilaantonico.associacao.domain.Evento;
import com.vilaantonico.associacao.service.EventoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/evento")
public class EventoController {
    private final EventoService service;

    public EventoController(EventoService service) {
        this.service = service;
    }

    @PostMapping
    public Evento salvar(@RequestBody Evento evento) {
        return this.service.salvar(evento);
    }

    @GetMapping()
    public List<Evento> buscarTodos() {
        return this.service.buscarTodos();
    }

    @GetMapping("/{id}")
    public Evento buscarPorId(@PathVariable Long id) {
        return this.service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable Long id, @RequestBody Evento novoEvento) {
        this.service.atualizar(id, novoEvento);
    }

    @DeleteMapping("{id}")
    public void deletar(@PathVariable Long id) {
        this.service.deletar(id);
    }
}
