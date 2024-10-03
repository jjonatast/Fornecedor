package com.meva.finance.category.model;

import lombok.*;

import javax.persistence.*;

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
    private String description;

}