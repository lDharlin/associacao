package com.vilaantonico.associacao.service;

import com.vilaantonico.associacao.domain.Imovel;
import com.vilaantonico.associacao.repository.ImovelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImovelService {

    @Autowired
    private ImovelRepository repository;

    public List<Imovel> listarTodos() {
        return repository.findAll();
    }

    public Optional<Imovel> buscarPorId(Long id){
        return repository.findById(id);
    }

    public Imovel salvar(Imovel imovel) {
        return repository.save(imovel);
    }

    public void excluir(Imovel imovel){
        repository.delete(imovel);
    }

    public Imovel editarImovel(Imovel imovel){
        if (repository.existsById(imovel.getId())) {
            return repository.save(imovel);
        } else {
            return imovel;
        }
    }
}
