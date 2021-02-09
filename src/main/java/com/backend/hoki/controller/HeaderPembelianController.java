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

import com.backend.hoki.entity.HeaderPembelian;
import com.backend.hoki.service.HeaderPembelianService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/headerpembelian")
public class HeaderPembelianController {
	
	@Autowired
	HeaderPembelianService dao;
	
	@GetMapping("/all")
	public List<HeaderPembelian> getAll() {
		return dao.getAll();
	}
	
	@GetMapping("/getbyid/{id}")
	public HeaderPembelian getById(@PathVariable int id) {
		HeaderPembelian headerPembelian= dao.getById(id);
		return headerPembelian;
	}
	
	@PostMapping("/save")
	public boolean add(@RequestBody HeaderPembelian headerPembelian) {
		headerPembelian.setKodePembelian(headerPembelian.getKodePembelian());
		headerPembelian.setTanggalPembelian(headerPembelian.getTanggalPembelian());
		headerPembelian.setKodeSupplier(headerPembelian.getKodeSupplier());
		headerPembelian.setMetodePembayaran(headerPembelian.getMetodePembayaran());
		headerPembelian.setTotalPembelian(headerPembelian.getTotalPembelian());
		headerPembelian.setOngkir(headerPembelian.getOngkir());
		headerPembelian.setPotongan(headerPembelian.getPotongan());
		
		return this.dao.add(headerPembelian);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		if (dao.isExistTestById(id)) {
			this.dao.delete(id);
		}
	}
	
//	@PutMapping("/update/{id}")
//	public String updateKategori(@RequestBody Barang barangs, @PathVariable int id) {
//		String message = null;
//		if (dao.isExistTestById(id)) {
//			Barang barang = dao.getById(id);
//			if(barangs.getKodeBarang() != null) {
//				barang.setKodeBarang(barangs.getKodeBarang());
//			}
//			if(barangs.getNamaBarang() != null) {
//				barang.setNamaBarang(barangs.getNamaBarang());
//			}
//			if(barangs.getKodeKategori() != null) {
//				barang.setKodeKategori(barangs.getKodeKategori());
//			}
//			if(this.dao.addBarang(barang)) {
//				message = "Success edit data";
//			}else {
//				message = "Failed to edit data";
//			}
//		}
//		return message;
//	}
}
