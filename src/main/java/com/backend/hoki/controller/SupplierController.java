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

import com.backend.hoki.entity.Supplier;
import com.backend.hoki.service.SupplierService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/supplier")
public class SupplierController {

	@Autowired
	SupplierService dao;
	
	@GetMapping("/all")
	public List<Supplier> getAllSupplier() {
		return dao.getAllSupplier();
	}
	
	@GetMapping("/getbyid/{id}")
	public Supplier getSupplierById(@PathVariable int id) {
		Supplier supplier= dao.getById(id);
		return supplier;
	}
	
	@PostMapping("/save")
	public boolean addSupplier(@RequestBody Supplier supplier) {
		supplier.setKodeSupplier(supplier.getKodeSupplier());
		supplier.setNamaSupplier(supplier.getNamaSupplier());
		supplier.setLinkSupplier(supplier.getLinkSupplier());
		
		return this.dao.addSupplier(supplier);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteSupplier(@PathVariable int id) {
		if (dao.isExistTestById(id)) {
			this.dao.deleteSupplier(id);
		}
	}
	
	@PutMapping("/update/{id}")
	public String updateSupplier(@RequestBody Supplier suppliers, @PathVariable int id) {
		String message = null;
		if (dao.isExistTestById(id)) {
			Supplier supplier = dao.getById(id);
			if(suppliers.getKodeSupplier() != null) {
				supplier.setKodeSupplier(suppliers.getKodeSupplier());
			}
			if(suppliers.getNamaSupplier() != null) {
				supplier.setNamaSupplier(suppliers.getNamaSupplier());
			}
			if(suppliers.getLinkSupplier() != null) {
				supplier.setLinkSupplier(suppliers.getLinkSupplier());
			}
			
			if(this.dao.addSupplier(supplier)) {
				message = "Success edit data";
			}else {
				message = "Failed to edit data";
			}
		}
		return message;
	}
}
