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
@Table(name="quantities")
public class QuantityModel {
    @Id
    @SequenceGenerator(
            name = "quantity_id_sequence",
            sequenceName = "quantity_id_sequence",
            allocationSize = 1,
            initialValue = 1000
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "quantity_id_sequence"
    )
    private Integer id;
    private int sold;
    private int available;
    private int medicineDetails_id;
    private int warehouse_id;

}
