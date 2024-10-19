package com.meva.finance.category.api;

import java.util.List;

import com.meva.finance.category.dto.DtoCategory;
import com.meva.finance.category.model.Category;
import com.meva.finance.category.service.ServiceCategory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping ("/category")

public class ControllerCategory {

    private final ServiceCategory serviceCategory;

    public ControllerCategory(ServiceCategory serviceCategory) {
        this.serviceCategory = serviceCategory;
    }

    @GetMapping("/produto/{description}") // Aqui está o parâmetro
    public ResponseEntity<DtoCategory> findByCategory(@PathVariable String description) {
        DtoCategory dtoCategory = serviceCategory.findByCategory(description);
        return ResponseEntity.ok(dtoCategory);
    }
}
