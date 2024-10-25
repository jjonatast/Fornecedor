package com.meva.finance.category.dto;

import com.meva.finance.category.model.Category;
import com.meva.finance.category.model.SubCategory;
import lombok.*;

import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class DtoCategory {

    @NotBlank
    private String description;

    private Integer id_category;

    public DtoCategory(Category category){
        this.id_category = category.getId_category();
        this.description = category.getDescription();

    }

    @Override
    public String toString() {
        return "DtoCategory{" +
                "id_category=" + id_category +
                ", description='" + description + '\'' +
                '}';
    }

}