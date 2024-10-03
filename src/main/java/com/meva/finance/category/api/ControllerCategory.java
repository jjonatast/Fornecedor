package com.meva.finance.category.api;

import java.util.logging.Logger;

import com.meva.finance.category.dto.DtoCategory;
import com.meva.finance.category.service.ServiceCategory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.naming.ldap.Control;
@Slf4j
@RestController
@RequestMapping ("/category")

public class ControllerCategory {

    private final ServiceCategory serviceCategory;

    public ControllerCategory(ServiceCategory serviceCategory){
        this.serviceCategory = serviceCategory;
    }

    @PostMapping("/create")
    public void createCategory(@RequestBody  DtoCategory dtoCategory) {
        log.info("Received user: {}", dtoCategory);
        serviceCategory.saveCategory(dtoCategory);
    }


    }
