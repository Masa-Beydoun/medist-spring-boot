package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.apachecommons.CommonsLog;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="pharmacists")
public class PharmacistModel {
    @Id
    @SequenceGenerator(
            name = "pharmacist_id_sequence",
            sequenceName = "pharmacist_id_sequence",
            allocationSize = 1,
            initialValue = 1000
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "pharmacist_id_sequence"
    )
    private Integer id;
    @Column(nullable = false , unique = true)
    private String name;
    @Column(unique = true, nullable = false)
    private String email;
    @Column( nullable = false)
    private String password;
    private String token;
    @Column(unique = true , nullable = false)
    private int phone_number;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "address_id", referencedColumnName = "id")
//    private AddressModel address;
    //many ot many favourites

}
