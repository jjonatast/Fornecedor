package br.com.alura.microservice.fornecedor.service;

import br.com.alura.microservice.fornecedor.model.InfoFornecedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoService {

    @Autowired
    private InfoRepository infoRepository;

    public InfoFornecedor getInfoPorEstado(String estado) {
        // Usa o método orElseThrow para tratar o Optional corretamente
        return infoRepository.findByEstado(estado)
                .orElseThrow(() -> new RuntimeException("Estado não encontrado: " + estado));
    }
}
