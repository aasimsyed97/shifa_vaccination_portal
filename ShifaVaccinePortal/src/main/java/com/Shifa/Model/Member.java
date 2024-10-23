package com.Shifa.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;

    private Boolean dose1status;
    private Boolean dose2status;
    private LocalDate dose1date;
    private LocalDate dose2date;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idcard_id", referencedColumnName = "id")
    private IdCard idCard;

}