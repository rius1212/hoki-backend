package com.backend.hoki.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.hoki.entity.Supplier;
import com.backend.hoki.repository.SupplierRepository;

@Service
public class SupplierService {

	@Autowired
	SupplierRepository supplierRepository;
	
	public List<Supplier> getAllSupplier() {
		return this.supplierRepository.findAll();
	}
	
	public Supplier getById(int id) {
		return this.supplierRepository.findById(id).get();
	}
	
	
	public boolean addSupplier(Supplier supplier) {
		return this.supplierRepository.save(supplier) != null;
	}
	
	public boolean isExistTestById(int id) {
		return this.supplierRepository.existsById(id);
	}
	
	public void deleteSupplier(int id) {
		this.supplierRepository.deleteById(id);
	}
}
