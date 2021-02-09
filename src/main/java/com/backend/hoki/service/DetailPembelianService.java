package com.backend.hoki.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.hoki.entity.DetailPembelian;
import com.backend.hoki.repository.DetailPembelianRepository;

@Service
public class DetailPembelianService {

	@Autowired
	DetailPembelianRepository repository;
	
	public List<DetailPembelian> getAll() {
		return this.repository.findAll();
	}
	
	public DetailPembelian getById(int id) {
		return this.repository.findById(id).get();
	}
	
	
	public boolean add(DetailPembelian detailPembelian) {
		return this.repository.save(detailPembelian) != null;
	}
	
	public boolean isExistTestById(int id) {
		return this.repository.existsById(id);
	}
	
	public void delete(int id) {
		this.repository.deleteById(id);
	}
}
