package com.meva.finance.category.repository;

import com.meva.finance.category.model.Category;
import com.meva.finance.category.model.SubCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RepositorySubCategory extends JpaRepository<SubCategory, Integer> {
    Optional<SubCategory> findByDescription(String description);
}
