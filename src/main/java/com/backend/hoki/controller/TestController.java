package com.backend.hoki.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.hoki.entity.Test;
import com.backend.hoki.service.TestService;



@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/test")
public class TestController {

	@Autowired
	TestService dao;
	
	@GetMapping("/all")
	public List<Test> getAllTest() {
		return dao.getAllTest();
	}
	
	@GetMapping("/getbyid/{id}")
	public Test getTestById(@PathVariable int id) {
		Test test = dao.getById(id);
		return test;
	}
	
	@GetMapping("/getbyname/{name}")
	public Test getTestByName(@PathVariable String name) {
		Test test = dao.getByName(name);
		return test;
	}
	
	@PostMapping("/save")
	public boolean addTest(@RequestBody Test test) {
		test.setCode(test.getCode());
		test.setName(test.getName());
		
		return this.dao.addTest(test);
	}
	
	@DeleteMapping("/delete/{id}")
	public void addTest(@PathVariable int id) {
		if (dao.isExistTestById(id)) {
			this.dao.deleteTest(id);
		}
	}
	
	@PutMapping("/update/{id}")
	public String updateBankList(@RequestBody Test test, @PathVariable int id) {
		String message = null;
		if (dao.isExistTestById(id)) {
			Test tes = dao.getById(id);
			if(test.getCode() != null) {
				tes.setCode(test.getCode());
			}
			if(test.getName() != null) {
				tes.setName(test.getName());
			}
			if(this.dao.addTest(tes)) {
				message = "Success added test data";
			}else {
				message = "Failed to added test data";
			}
		}
		return message;
	}
	
	
}
