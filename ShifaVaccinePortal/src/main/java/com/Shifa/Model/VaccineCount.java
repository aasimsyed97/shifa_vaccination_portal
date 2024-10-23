package com.Shifa.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VaccineCount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long countId;

    private int quantity;
    private double price;

    @ManyToOne
    @JoinColumn(name = "vaccine_id", referencedColumnName = "vaccineId")
    private Vaccine vaccine;


}
