package com.example.floricultura.Loja.ControllerLoja;


import com.example.floricultura.Loja.Dto.CompraDTO;
import com.example.floricultura.Loja.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compra")
public class CompraController {

    @Autowired
    private CompraService compraService;

    @RequestMapping(method = RequestMethod.POST)
    public void realizaCompra(@RequestBody CompraDTO compra){
        compraService.realizaCompra(compra);








        System.out.println(compra);
    }

}
