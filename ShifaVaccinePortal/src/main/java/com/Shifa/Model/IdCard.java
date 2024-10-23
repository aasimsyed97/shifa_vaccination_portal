package com.Shifa.Model;

import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class IdCard implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -1102031578842850560L;

    /**
     * Added default constructor.
     */
    public IdCard() {
        // It is a default constructor
    }
    @Id
    @Column(name = "UUID", columnDefinition = "uniqueidentifier")
    private UUID id;
    private String name;
    private LocalDate dob;
    private String gender;
    private String address;
    private String city;
    private String state;
    private String pincode;
}
