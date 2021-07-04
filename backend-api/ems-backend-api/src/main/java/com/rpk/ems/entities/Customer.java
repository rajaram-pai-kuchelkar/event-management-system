package com.rpk.ems.entities;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerId;

    @Column(length = 50, nullable = false)
    private String customerName;

    @Column(nullable = false)
    private LocalDate createdDt;

}
