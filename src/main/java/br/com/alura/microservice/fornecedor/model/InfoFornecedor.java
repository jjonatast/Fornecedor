package br.com.alura.microservice.fornecedor.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class InfoFornecedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String endereco;
    private String nome;
    @Column(name = "estado")
    private String estado;



}
