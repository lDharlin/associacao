package com.vilaantonico.associacao.controller;

import com.vilaantonico.associacao.domain.Veiculo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produtos")
public class VeiculoController {

    @PostMapping("/")
    public void salvar(@RequestBody Veiculo veiculo){
        System.out.println(veiculo.getNome());
    }


}
