package com.Shifa.Model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VaccineInventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long inventoryId;

    private LocalDate date;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "inventory_id")
    private List<VaccineCount> vaccineCountList;

    @ManyToOne
    @JoinColumn(name = "center_id", referencedColumnName = "code")
    private VaccinationCenter center;

}
