package com.meva.finance.category.service;

import com.meva.finance.category.dto.DtoCategory;
import com.meva.finance.category.model.Category;
import com.meva.finance.category.repository.RepositoryCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServiceCategory {

    private RepositoryCategory repositoryCategory;

    @Autowired
    public ServiceCategory(RepositoryCategory repositoryCategory) {
        this.repositoryCategory = repositoryCategory;
    }

    public Category saveCategory(DtoCategory dtoCategory) {
        Integer id_category = dtoCategory.getId_category();

        {}
        if (id_category == 0) {

            Category newCategory = Category.builder().description(dtoCategory.getDescription()).build();
            newCategory = repositoryCategory.save(newCategory);
            dtoCategory.setId_category(newCategory.getId_category());

        }
        Category category = dtoCategory.converter();
        return dtoCategory.converter();
    }

}

