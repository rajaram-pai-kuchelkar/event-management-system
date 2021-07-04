package com.rpk.ems.model;

import com.rpk.ems.entities.Customer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProjectVO {

    private int projectId;

    private String projectTitle;

    private int customerId;
}


