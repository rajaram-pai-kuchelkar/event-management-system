package com.rpk.ems.controller;

import com.rpk.ems.dao.CustomerDao;
import com.rpk.ems.dao.ProjectDao;
import com.rpk.ems.entities.Customer;
import com.rpk.ems.entities.Project;
import com.rpk.ems.model.ProjectVO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("v1/api")
public class ProjectController {
    @Autowired
    CustomerDao customerDao;

    @Autowired
    ProjectDao projectDao;

    @Autowired
    ModelMapper modelMapper;

    @GetMapping("/customers")
    public ResponseEntity getCustomers(){

        return new ResponseEntity(customerDao.findAll(), HttpStatus.OK);
    }

    @GetMapping("/projects/{customerId}")
    public ResponseEntity getCustomersById(@PathVariable(name="customerId") int customerId){
        List<ProjectVO> listProjectVO = new ArrayList<>();
        List<Project> listProject= projectDao.findAllByCustomerId(customerId);

        for(Project p : listProject){
            ProjectVO pvo = modelMapper.map(p, ProjectVO.class);
            listProjectVO.add(pvo);
        }
        //System.out.println(listProject.size());
        return new ResponseEntity(listProjectVO, HttpStatus.OK);
    }


}
