package com.example.floricultura.Loja.Dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.batch.BatchTransactionManager;

@Getter
@Setter
public class EnderecoDTO {

    private String rua;
    private int numero;
    private String estado;


    @Override
    public String toString() {
        return "{ " +
                "rua = " + rua +
                ", numero = " + numero + '\'' +
                ", estado = " + estado + '\'' +
                '}';
    }
}
