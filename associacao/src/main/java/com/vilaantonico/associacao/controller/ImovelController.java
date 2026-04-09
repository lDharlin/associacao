package com.vilaantonico.associacao.controller;

import com.vilaantonico.associacao.domain.Imovel;
import com.vilaantonico.associacao.service.ImovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/imoveis")
public class ImovelController {
    
    @Autowired
    private ImovelService service;

    @PostMapping
    public void criar(@RequestBody Imovel imovel){
        service.salvar(imovel);
    }

    @GetMapping("/{id}")
    public Optional<Imovel> consultar(@PathVariable Long id){
        return service.buscarPorId(id);
    }

    @GetMapping
    public List<Imovel> listarTodos(){
        return service.listarTodos();
    }
}