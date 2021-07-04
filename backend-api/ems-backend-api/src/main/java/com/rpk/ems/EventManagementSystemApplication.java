package com.rpk.ems;

import com.rpk.ems.dao.CustomerDao;
import com.rpk.ems.entities.Customer;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
public class EventManagementSystemApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(EventManagementSystemApplication.class, args);
		CustomerDao customerDao = applicationContext.getBean(CustomerDao.class);
		List<Customer> li = customerDao.findAll();
		for(Customer customer: li){
			System.out.print(customer.getCustomerId()+" "+customer.getCustomerName());
			System.out.println();
		}
		System.out.println("done");


	}

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

}
