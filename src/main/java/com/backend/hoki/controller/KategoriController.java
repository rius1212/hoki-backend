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

import com.backend.hoki.entity.Kategori;
import com.backend.hoki.service.KategoriService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/kategori")
public class KategoriController {

	@Autowired
	KategoriService dao;
	
	@GetMapping("/all")
	public List<Kategori> getAllKategori() {
		return dao.getAllKategori();
	}
	
	@GetMapping("/getbyid/{id}")
	public Kategori getKategoriById(@PathVariable int id) {
		Kategori kategori = dao.getById(id);
		return kategori;
	}
	
	@PostMapping("/save")
	public boolean addKategori(@RequestBody Kategori kategori) {
		kategori.setNamaKategori(kategori.getNamaKategori());
		kategori.setKodeKategori(kategori.getKodeKategori());

		return this.dao.addKategori(kategori);
	}
	
	@DeleteMapping("/delete/{id}")
	public void addkategori(@PathVariable int id) {
		if (dao.isExistTestById(id)) {
			this.dao.deleteKategori(id);
		}
	}
	
	@PutMapping("/update/{id}")
	public String updateKategori(@RequestBody Kategori kategoris, @PathVariable int id) {
		String message = null;
		if (dao.isExistTestById(id)) {
			Kategori kategori = dao.getById(id);
			if(kategoris.getKodeKategori() != null) {
				kategori.setKodeKategori(kategoris.getKodeKategori());
			}
			if(kategoris.getNamaKategori() != null) {
				kategori.setNamaKategori(kategoris.getNamaKategori());
			}
			
			if(this.dao.addKategori(kategori)) {
				message = "Success edit data";
			}else {
				message = "Failed to edit data";
			}
		}
		return message;
	}
}
