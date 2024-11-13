package br.com.alura.microservice.fornecedor.controller;

import br.com.alura.microservice.fornecedor.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class InfoController {


    @Autowired
    private InfoService infoService;


    @RequestMapping("/{estado}")
    public void getInfoPorEstado( String estado){

    }
}
