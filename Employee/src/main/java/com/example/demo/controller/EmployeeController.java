package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService empServ;

	@GetMapping("display")
	public List<Employee> display() {
		return empServ.display();
	}

	@PostMapping("add")
	public void add(@RequestBody Employee emp) {
		// TODO: process POST request
		empServ.add(emp);
	}

	@PutMapping("update/{id}")
	public Employee update(@PathVariable Integer id, @RequestBody Employee emp) {
		// TODO: process PUT request

		return empServ.update(emp, id);
	}

	@DeleteMapping("delete/{id}")
	public void delete(@PathVariable Integer id) {
		empServ.delete(id);
	}

}