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
@Table(name="settings")
public class SettingModel {
    @Id
    @SequenceGenerator(
            name = "setting_id_sequence",
            sequenceName = "setting_id_sequence",
            allocationSize = 1,
            initialValue = 1000
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "setting_id_sequence"
    )
    private Integer id;
    private String theme;
    private String language;
    private int pharmacist_id;

}
