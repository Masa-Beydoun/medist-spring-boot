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
@Table(name="medicine_orders")
public class MedicineOrderModel {
    @Id
    @SequenceGenerator(
            name = "medicine_orders_id_sequence",
            sequenceName = "medicine_orders_id_sequence",
            allocationSize = 1
//            initialValue = 1000
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "medicine_orders_id_sequence"
    )
    private Integer id;

    private int order_id;
    private Date deliveredAt;
    private boolean payment_status;
    private boolean is_accepted;
    private int bill;
    private int warehouse_id;
    private int medicine_id;
    private int dose_id;
    private int quantity;
    private int price;


}
