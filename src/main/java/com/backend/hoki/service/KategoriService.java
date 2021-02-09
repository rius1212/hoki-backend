package com.backend.hoki.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.hoki.entity.Kategori;
import com.backend.hoki.repository.KategoriRepository;

@Service
public class KategoriService {

	@Autowired
	KategoriRepository kategoriRepository;
	

	public List<Kategori> getAllKategori() {
		return this.kategoriRepository.findAll();
	}
	
	public Kategori getById(int id) {
		return this.kategoriRepository.findById(id).get();
	}
	
	
	public boolean addKategori(Kategori kategori) {
		return this.kategoriRepository.save(kategori) != null;
	}
	
	public boolean isExistTestById(int id) {
		return this.kategoriRepository.existsById(id);
	}
	
	public void deleteKategori(int id) {
		this.kategoriRepository.deleteById(id);
	}
}
