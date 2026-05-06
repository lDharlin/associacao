package com.vilaantonico.associacao.controller;

import com.vilaantonico.associacao.domain.Pessoa;
import com.vilaantonico.associacao.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {
    @Autowired
    private final PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }
    @PostMapping
    public ResponseEntity<String> salvarPessoa(@RequestBody Pessoa pessoa){
        pessoaService.salvarPessoa(pessoa);
        return ResponseEntity.status(HttpStatus.CREATED).body("Usuário criado com sucesso!");
    }
    @GetMapping
    public List<Pessoa> buscarPessoas(){
        return pessoaService.buscarPessoas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pessoa> buscarPorId(@PathVariable Long id){
        return ResponseEntity.ok(pessoaService.buscarPorId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> excluirPessoa(@PathVariable Long id){
        pessoaService.excluirPessoa(id);
        return ResponseEntity.ok().body("Usuário excluído");
    }
    @PutMapping("/{id}")
    public ResponseEntity<Pessoa> atualizarPessoa(@PathVariable Long id, @RequestBody Pessoa pessoa) {
                return ResponseEntity.ok(pessoaService.atualizarPessoa(id, pessoa));
    }
}
