package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="companies")
public class CompanyModel {

    @Id
    @SequenceGenerator(
            name = "company_id_sequence",
            sequenceName = "company_id_sequence",
            allocationSize = 1
//            initialValue = 1000
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "company_id_sequence"
    )
    private Integer id;
    private String name;


    //many to many
//    private int warehouseId;
}
