package com.example.floricultura.Loja.Dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CompraDTO {

    private List<ItemDaCompraDTO> itens;
    private EnderecoDTO endereco;



    @Override
    public String toString() {
        return "CompraDTO { " +
                 itens +
                ", Endereco = '" + endereco + '\'' +
                '}';
    }
}
