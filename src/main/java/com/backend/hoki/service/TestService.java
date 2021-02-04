package com.backend.hoki.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.hoki.entity.Test;
import com.backend.hoki.repository.TestRepository;


@Service
public class TestService {

	@Autowired
	TestRepository testRepository;
	
	public List<Test> getAllTest() {
		return this.testRepository.findAll();
	}
	
	public Test getById(int id) {
		return this.testRepository.findById(id).get();
	}
	
	public Test getByName(String name) {
		return this.testRepository.caricari(name);
	}
	
	public boolean addTest(Test test) {
		return this.testRepository.save(test) != null;
	}
	
	public boolean isExistTestById(int id) {
		return this.testRepository.existsById(id);
	}
	
	public void deleteTest(int id) {
		this.testRepository.deleteById(id);
	}
}
