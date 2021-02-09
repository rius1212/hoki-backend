package com.backend.hoki.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "M_BARANG")
public class Barang {

	@Column(name="ID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "KODE_BARANG", nullable = true, length = 255)
	public String kodeBarang;
	
	@Column(name = "NAMA_BARANG", nullable = true, length = 255)
	public String namaBarang;
	
	@Column(name = "KODE_KATEGORI", nullable = true, length = 255)
	public String kodeKategori;
	
	public Barang() {}

	public Barang(Integer id, String kodeBarang, String namaBarang, String kodeKategori) {
		super();
		this.id = id;
		this.kodeBarang = kodeBarang;
		this.namaBarang = namaBarang;
		this.kodeKategori = kodeKategori;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getKodeBarang() {
		return kodeBarang;
	}

	public void setKodeBarang(String kodeBarang) {
		this.kodeBarang = kodeBarang;
	}

	public String getNamaBarang() {
		return namaBarang;
	}

	public void setNamaBarang(String namaBarang) {
		this.namaBarang = namaBarang;
	}

	public String getKodeKategori() {
		return kodeKategori;
	}

	public void setKodeKategori(String kodeKategori) {
		this.kodeKategori = kodeKategori;
	}
}
