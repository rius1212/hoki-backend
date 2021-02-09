package com.backend.hoki.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "M_KATEGORI")
public class Kategori {

	@Column(name="ID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "NAMA_KATEGORI", nullable = true, length = 255)
	public String namaKategori;

	@Column(name = "KODE_KATEGORI", nullable = true, length = 255)
	public String kodeKategori;
	
	public Kategori() {}

	public Kategori(Integer id, String namaKategori, String kodeKategori) {
		super();
		this.id = id;
		this.namaKategori = namaKategori;
		this.kodeKategori = kodeKategori;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNamaKategori() {
		return namaKategori;
	}

	public void setNamaKategori(String namaKategori) {
		this.namaKategori = namaKategori;
	}

	public String getKodeKategori() {
		return kodeKategori;
	}

	public void setKodeKategori(String kodeKategori) {
		this.kodeKategori = kodeKategori;
	}
	
}
