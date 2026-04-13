package com.vilaantonico.associacao.service;


import com.vilaantonico.associacao.domain.Veiculo;
import com.vilaantonico.associacao.repository.VeiculoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VeiculoService {

    private  final VeiculoRepository veiculoRepository;

    public VeiculoService(VeiculoRepository veiculoRepository) {
        this.veiculoRepository = veiculoRepository;
    }

    public List<Veiculo> listarTodos() {
       return this.veiculoRepository.findAll();

    }

    public Veiculo buscarPorId(Long id) {
       return this.veiculoRepository.findById(id)
               .orElseThrow(() -> new RuntimeException("Veiculo não encontrado"));

    }

    public Veiculo Salvar(Veiculo veiculo) {
        return this.veiculoRepository.save(veiculo);

    }

    public Veiculo atualizar(Long id, Veiculo novoVeiculo) {
        Veiculo veiculo = veiculoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Veiculo não encontrado com id: " + id));

        veiculo.setModelo(novoVeiculo.getModelo());
        veiculo.setMarca(novoVeiculo.getMarca());
        veiculo.setAno(novoVeiculo.getAno());
        veiculo.setValorEstimado(novoVeiculo.getValorEstimado());

        return this.veiculoRepository.save(veiculo);
    }

    public void excluir(Long id) {
        Veiculo veiculo = veiculoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Veiculo não encontrado com id: " + id));

        this.veiculoRepository.delete(veiculo);
    }


}
