package com.backend.hoki.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.hoki.entity.Barang;
import com.backend.hoki.repository.BarangRepository;

@Service
public class BarangService {

	@Autowired
	BarangRepository barangRepository;
	
	public List<Barang> getAllBarang() {
		return this.barangRepository.findAll();
	}
	
	public Barang getById(int id) {
		return this.barangRepository.findById(id).get();
	}
	
	
	public boolean addBarang(Barang barang) {
		return this.barangRepository.save(barang) != null;
	}
	
	public boolean isExistTestById(int id) {
		return this.barangRepository.existsById(id);
	}
	
	public void deleteBarang(int id) {
		this.barangRepository.deleteById(id);
	}
}
