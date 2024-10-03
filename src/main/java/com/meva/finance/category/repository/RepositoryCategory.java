package com.meva.finance.category.repository;

import com.meva.finance.category.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryCategory extends JpaRepository <Category, Integer> {


}
