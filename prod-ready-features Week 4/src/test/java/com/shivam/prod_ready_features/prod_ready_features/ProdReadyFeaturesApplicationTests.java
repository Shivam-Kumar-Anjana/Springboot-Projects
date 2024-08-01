package com.shivam.prod_ready_features.prod_ready_features;

import com.shivam.prod_ready_features.prod_ready_features.clients.EmployeeClient;
import com.shivam.prod_ready_features.prod_ready_features.dto.EmployeeDTO;
import jakarta.persistence.Embeddable;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ProdReadyFeaturesApplicationTests {

	@Autowired
	private EmployeeClient employeeClient;

	@Test
	@Order(3)
	void getAllEmployees(){
		List<EmployeeDTO> employeeDTOList = employeeClient.getAllEmployees();
		System.out.println(employeeDTOList);
	}

	@Test
	@Order(2)
	void getEmployeeByIdTest(){
		EmployeeDTO employeeDTO = employeeClient.getEmployeeById(1L);
		System.out.println(employeeDTO);
	}

	@Test
	@Order(1)
	void createNewEmployeeTest(){
		EmployeeDTO employeeDTO = new EmployeeDTO(null, "Shivam", "Shivam@gmail.com",
				22, "ADMIN", 5088.77,
				LocalDate.of(2020,11,12), true);
		EmployeeDTO SavedemployeeDTO = employeeClient.createNewEmployee(employeeDTO);
		System.out.println(SavedemployeeDTO);
	}
}
