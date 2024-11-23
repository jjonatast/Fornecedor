package br.com.alura.microservice.fornecedor.service;

import br.com.alura.microservice.fornecedor.model.InfoFornecedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InfoService {

@Autowired
private InfoRepository infoRepository;

    public Optional<InfoFornecedor> getInfoPorEstado(String estado) {

        return infoRepository.findByEstado(estado);



    }
}
