package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;
import org.apache.tomcat.util.json.JSONParser;

import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name="medicines")
public class MedicineModel {
    @Id
    @SequenceGenerator(
            name = "medicine_id_sequence",
            sequenceName = "medicine_id_sequence",
            allocationSize = 1,
            initialValue = 1000
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "medicine_id_sequence"
    )
    private Integer id;
    private String commercial_name;
    @Column(length=200, nullable=false)
    private String description;
    @Column(unique = true)
    private String scientific_name;
    private int companyId;
    private int categoryId;
    private int warehouseId;
    //belongs to many pharmacist favorite


//    @OneToMany(mappedBy="medicine" , cascade = CascadeType.ALL)
//    private Set<MedicineDetailsModel> items;
}
