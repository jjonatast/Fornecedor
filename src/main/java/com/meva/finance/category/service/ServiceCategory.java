package com.meva.finance.category.service;

import com.meva.finance.category.dto.DtoCategory;
import com.meva.finance.category.model.Category;
import com.meva.finance.category.repository.RepositoryCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceCategory {

    private RepositoryCategory repositoryCategory;

    @Autowired
    public ServiceCategory(RepositoryCategory repositoryCategory) {
        this.repositoryCategory = repositoryCategory;

    }

    private String cleanDescription(String description) {
        if (description == null || description.isEmpty()) {
            return ""; //
        }

        List<String> words = Arrays.asList(description.trim().split("\\s+"));
        List<String> cleanedWords = words.stream()
                .filter(word -> word.length() >= 3)
                .collect(Collectors.toList());

        return String.join(" ", cleanedWords);
    }

public DtoCategory findByCategory (String description){
        Category category = repositoryCategory.findByDescription(description)
                .orElseThrow(() -> new IllegalArgumentException("NÃO ENCONTRADO " + description));
                return new DtoCategory(category);
}
}



