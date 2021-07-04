package com.rpk.ems.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int projectId;

    @Column(length=50)
    private String projectTitle;

    @ManyToOne
    @JoinColumn(name= "customer_id", nullable = false)
    private Customer customer;

}
