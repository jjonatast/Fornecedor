package br.com.alura.microservice.fornecedor.service;

import br.com.alura.microservice.fornecedor.model.InfoFornecedor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InfoRepository extends CrudRepository<InfoFornecedor, Long> {

    Optional<InfoFornecedor> findByEstado(String estado);
}



