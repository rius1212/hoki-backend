package com.backend.hoki.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.hoki.entity.HeaderPembelian;
import com.backend.hoki.repository.HeaderPembelianRepository;

@Service
public class HeaderPembelianService {

	@Autowired
	HeaderPembelianRepository repository;
	
	public List<HeaderPembelian> getAll() {
		return this.repository.findAll();
	}
	
	public HeaderPembelian getById(int id) {
		return this.repository.findById(id).get();
	}
	
	
	public boolean add(HeaderPembelian headerPembelian) {
		return this.repository.save(headerPembelian) != null;
	}
	
	public boolean isExistTestById(int id) {
		return this.repository.existsById(id);
	}
	
	public void delete(int id) {
		this.repository.deleteById(id);
	}
}
