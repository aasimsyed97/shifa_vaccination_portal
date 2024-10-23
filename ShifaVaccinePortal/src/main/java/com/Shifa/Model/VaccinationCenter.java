package com.Shifa.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VaccinationCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer code;

    private String centername;
    private String address;
    private String city;
    private String state;
    private String pincode;

    @OneToMany(mappedBy = "center")
    private List<Appointment> appointments;


}
