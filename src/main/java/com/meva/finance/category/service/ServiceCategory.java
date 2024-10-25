package com.meva.finance.category.service;
import com.meva.finance.category.dto.DtoCategory;

import com.meva.finance.category.model.Category;
import com.meva.finance.category.model.SubCategory;
import com.meva.finance.category.repository.RepositorySubCategory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ServiceCategory {

    private RepositorySubCategory repositorySubCategory;

    @Autowired
    public ServiceCategory(RepositorySubCategory repositorySubCategory) {
        this.repositorySubCategory = repositorySubCategory;
    }
    public DtoCategory findByCategory(String description) {
        // Limpa e normaliza a descrição
        String cleanedDescription = cleanDescription(description.toLowerCase());

        // Agora você pode separar as palavras e verificar se alguma delas existe na tabela
        List<String> words = Arrays.asList(cleanedDescription.split(" "));

        Optional<SubCategory> optionalSubCategory = Optional.empty();

        // Tenta encontrar a primeira subcategoria que corresponda a qualquer uma das palavras
        for (String word : words) {
            optionalSubCategory = repositorySubCategory.findByDescription(word);
            if (optionalSubCategory.isPresent()) {
                break; // Sai do loop se encontrar uma subcategoria
            }
        }

        SubCategory subCategory = optionalSubCategory
                .orElseThrow(() -> new IllegalArgumentException("NÃO ENCONTRADO " + description));

        // Acesse a Category a partir do SubCategory
        Category category = subCategory.getCategory();
        return new DtoCategory(category.getDescription(), category.getId_category());
    }

    private String cleanDescription(String description) {
        if (description == null || description.isEmpty()) {
            return ""; // Retorna string vazia se a descrição for nula ou vazia
        }

        List<String> words = Arrays.asList(description.trim().split("\\s+"));
        List<String> cleanedWords = words.stream()
                .filter(word -> word.length() >= 3) // Remove palavras com menos de 3 letras
                .collect(Collectors.toList());

        return String.join(" ", cleanedWords); // Retorna as palavras limpas
    }
}

