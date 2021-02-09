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

import com.backend.hoki.entity.Barang;
import com.backend.hoki.service.BarangService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/barang")
public class BarangController {

	@Autowired
	BarangService dao;
	
	@GetMapping("/all")
	public List<Barang> getAllBarang() {
		return dao.getAllBarang();
	}
	
	@GetMapping("/getbyid/{id}")
	public Barang getBarangById(@PathVariable int id) {
		Barang barang = dao.getById(id);
		return barang;
	}
	
	@PostMapping("/save")
	public boolean addBarang(@RequestBody Barang barang) {
		barang.setKodeBarang(barang.getKodeBarang());
		barang.setNamaBarang(barang.getNamaBarang());
		barang.setKodeKategori(barang.getKodeKategori());
		return this.dao.addBarang(barang);
	}
	
	@DeleteMapping("/delete/{id}")
	public void addBarang(@PathVariable int id) {
		if (dao.isExistTestById(id)) {
			this.dao.deleteBarang(id);
		}
	}
	
	@PutMapping("/update/{id}")
	public String updateKategori(@RequestBody Barang barangs, @PathVariable int id) {
		String message = null;
		if (dao.isExistTestById(id)) {
			Barang barang = dao.getById(id);
			if(barangs.getKodeBarang() != null) {
				barang.setKodeBarang(barangs.getKodeBarang());
			}
			if(barangs.getNamaBarang() != null) {
				barang.setNamaBarang(barangs.getNamaBarang());
			}
			if(barangs.getKodeKategori() != null) {
				barang.setKodeKategori(barangs.getKodeKategori());
			}
			if(this.dao.addBarang(barang)) {
				message = "Success edit data";
			}else {
				message = "Failed to edit data";
			}
		}
		return message;
	}
}
