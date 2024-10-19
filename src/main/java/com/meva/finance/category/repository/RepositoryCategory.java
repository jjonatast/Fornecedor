package com.meva.finance.category.repository;

import com.meva.finance.category.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Component
@Repository
public interface RepositoryCategory extends JpaRepository <Category, String> {


    Optional< Category> findByDescription(String description);





    }

