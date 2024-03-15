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
@Entity(name="address")
@Table(name="addresses")
public class AddressModel {
    @Id
    @SequenceGenerator(
            name = "address_id_sequence",
            sequenceName = "address_id_sequence",
            allocationSize = 1
//            initialValue = 1000
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "address_id_sequence"
    )
    private Integer id;
    @Column(length=50, nullable=true, unique=false)
    private  String pharmacyName;
    private  String city;
    private  String street;
    @Column(length=100, nullable=true, unique=false)
    private  String region;
    private  String address_type;


    @OneToOne()
    @JoinColumn(name = "pharmacist_id")
    private PharmacistModel pharmacist;

}
