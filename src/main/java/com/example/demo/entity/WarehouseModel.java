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
@Table(name="warehouses")
public class WarehouseModel {
    @Id
    @SequenceGenerator(
            name = "warehouse_id_sequence",
            sequenceName = "warehouse_id_sequence",
            allocationSize = 1,
            initialValue = 1000
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "warehouse_id_sequence"
    )
    private Integer id;
    @Column(unique = true, nullable = false)
    private String username;
    private String password;
    private int device_token;

}
