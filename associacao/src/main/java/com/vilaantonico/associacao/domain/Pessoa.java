package com.vilaantonico.associacao.domain;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.context.annotation.ComponentScan;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Builder
@Table(name = "pessoa")
@ComponentScan
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email", nullable = false, unique = true)
    private String email;


    @Column(name= "nome",nullable = false, length = 100)
    private String nome;

    public Pessoa(){}

}
