package com.vilaantonico.associacao.controller;

import com.vilaantonico.associacao.domain.Veiculo;
import com.vilaantonico.associacao.service.VeiculoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/veiculo")
public class VeiculoController {

private  final VeiculoService veiculoService;

    public VeiculoController(VeiculoService veiculoService) {
        this.veiculoService = veiculoService;
    }

    @GetMapping
    public ResponseEntity<List<Veiculo>> listarTodos() {
        List<Veiculo> veiculos = this.veiculoService.listarTodos();
        return ResponseEntity.ok(veiculos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Veiculo> buscarPorId(@PathVariable("id") Long id) {
        Veiculo veiculo = this.veiculoService.buscarPorId(id);
        return ResponseEntity.ok(veiculo);
    }

    @PostMapping
    public ResponseEntity<Veiculo> salvar(@RequestBody Veiculo veiculo) {
        Veiculo novoVeiculo = this.veiculoService.Salvar(veiculo);
        return ResponseEntity.ok(novoVeiculo);


    }

    @PutMapping("/{id}")
    public ResponseEntity<Veiculo> atualizar(@PathVariable("id") Long id, @RequestBody Veiculo veiculo) {
        Veiculo novoVeiculo = this.veiculoService.atualizar(id, veiculo);

        return ResponseEntity.ok(novoVeiculo);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        this.veiculoService.excluir(id);
    }


}
