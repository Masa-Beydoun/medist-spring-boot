package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="medicine_details")
public class MedicineDetailsModel {
    @Id
    @SequenceGenerator(
            name = "medicineDetail_id_sequence",
            sequenceName = "medicineDetail_id_sequence",
            allocationSize = 1
//            initialValue = 1000
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "medicineDetail_id_sequence"
    )
    private Integer id;
    @Column(name="dose", length=30)
    private String dose;
    private String type;
    private String price;
    private Date expiry_date;
//    public int medicineId;
    private boolean isExpired;
    private int ExpiredPrice;

//    @ManyToOne
//    @JoinColumn(name = "medicine_id",nullable = false)
//    private MedicineModel medicineModel;





}
