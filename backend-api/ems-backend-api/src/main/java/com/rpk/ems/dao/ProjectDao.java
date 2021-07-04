package com.rpk.ems.dao;

import com.rpk.ems.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProjectDao extends JpaRepository<Project,Integer> {
    @Query("FROM Project WHERE customer_id = ?1")
    List<Project> findAllByCustomerId(int customerId);
}
