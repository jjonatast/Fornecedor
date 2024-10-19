package com.meva.finance.category.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Table(name = "sub_category")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder


public class SubCategory {

    @Id
    private Integer id_category;
    private Integer id_sub_category;
    private String description;


}
