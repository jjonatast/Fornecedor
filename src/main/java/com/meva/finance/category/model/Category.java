package com.meva.finance.category.model;

import com.meva.finance.category.model.SubCategory;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Table(name = "category")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_category;
    @NonNull
    private String description;

    @OneToMany(mappedBy = "category")
    private List<SubCategory> subCategories;
}
