package com.ex.controller;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ex.bo.Employee;
import com.ex.repo.ProductRepository;

@RestController
public class RestControllerClass {
	
	@Autowired
	ProductRepository repo;

	@PostMapping
	@RequestMapping(value = "/displayProducts", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Object> getProductDetailsOfTheProduct() {
		ResponseEntity<Object> res = null;
		
		repo.save(new Employee((long) 1, "malli", "hello"));
//oiu
		// res = ResponseEntity.status(HttpStatus.ACCEPTED).body(new
		// com.ex.exceptionhie.Error(301, "wrong"));
		
		res = ResponseEntity.ok().build();

		return res;
	}
	@PutMapping
	@RequestMapping("/update")
	public Employee update(@RequestBody @NotNull Employee employee) {
		Employee emp=repo.findByEmail(employee.getEmail());
		if(emp==null){
			Employee e=repo.save(employee);
			return e;
		}else if(emp.getEmpId()==employee.getEmpId()) {
			return repo.save(employee);
		}
		Employee ep=new Employee();
		ep.setDescription("employee already exist");
		return ep;
	}

}
