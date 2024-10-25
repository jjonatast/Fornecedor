package com.meva.finance.category.model;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Table(name = "sub_category")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder


public class SubCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_sub_category;
    @NotNull
    private String description;

    @ManyToOne
    @JoinColumn(name = "id_category", referencedColumnName = "id_category", nullable = false)
    private Category category;



}