package com.meva.finance.category.dto;

import com.meva.finance.category.model.Category;
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
    @NotBlank
    private Integer id_category;

    public Category converter(){
        return Category.builder()
                .id_category(id_category)
                .description(description).build();
    }


}
