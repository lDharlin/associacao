package com.vilaantonico.associacao.service;

import com.vilaantonico.associacao.domain.Pessoa;
import com.vilaantonico.associacao.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {
    @Autowired
    private final PessoaRepository repository;

    public PessoaService(PessoaRepository repository) {
        this.repository = repository;
    }

    public List<Pessoa> buscarPessoas(){
        return repository.findAll();
    }

    public Pessoa buscarPorId(Long id){
        return repository.findById(id).orElseThrow(
                () -> new RuntimeException("Usuário Não Encontrado"));
    }

    public Pessoa salvarPessoa(Pessoa pessoa){
        return repository.save(pessoa);
    }
    public void excluirPessoa(Long id){
        if (!repository.existsById(id)){
            throw new RuntimeException("Pessoa não encontrada");
        }
        repository.deleteById(id);
    }
    public Pessoa atualizarPessoa(Long id, Pessoa novaPessoa) {
        Pessoa pessoa = buscarPorId(id);

        if (novaPessoa.getNome() != null){
            pessoa.setNome(novaPessoa.getNome());
        }
        if (novaPessoa.getEmail() != null){
            pessoa.setEmail(novaPessoa.getEmail());
        }
        return repository.save(pessoa);
    }
}
