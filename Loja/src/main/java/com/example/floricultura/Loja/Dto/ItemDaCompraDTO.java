package com.example.floricultura.Loja.Dto;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemDaCompraDTO {

    private long id;
    private int quantidade;

    @Override
    public String toString() {
        return "ItemDaCompraDTO  { " +
                "id = " + id +
                ", quantidade = '" + quantidade + '\'' +
                '}';
    }
}
