package com.backend.hoki.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.hoki.entity.DetailPembelian;
import com.backend.hoki.service.DetailPembelianService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/detailpembelian")
public class DetailPembelianController {

	@Autowired
	DetailPembelianService dao;
	
	@GetMapping("/all")
	public List<DetailPembelian> getAll() {
		return dao.getAll();
	}
	
	@GetMapping("/getbyid/{id}")
	public DetailPembelian getById(@PathVariable int id) {
		DetailPembelian detailPembelian= dao.getById(id);
		return detailPembelian;
	}
	
	@PostMapping("/save")
	public boolean add(@RequestBody DetailPembelian detailPembelian) {
		detailPembelian.setKodePembelian(detailPembelian.getKodePembelian());
		detailPembelian.setKodeBarang(detailPembelian.getKodeBarang());
		detailPembelian.setNamaBarang(detailPembelian.getNamaBarang());
		detailPembelian.setHargaBeli(detailPembelian.getHargaBeli());
		detailPembelian.setQuantity(detailPembelian.getQuantity());
		detailPembelian.setTotalHarga(detailPembelian.getTotalHarga());
		
		return this.dao.add(detailPembelian);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		if (dao.isExistTestById(id)) {
			this.dao.delete(id);
		}
	}
}
