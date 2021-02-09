package com.backend.hoki.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "T_DETAIL_PEMBELIAN")
public class DetailPembelian {

	@Column(name="ID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "KODE_PEMBELIAN", nullable = true, length = 255)
	public String kodePembelian;
	
	@Column(name = "KODE_BARANG", nullable = true, length = 255)
	public String kodeBarang;
	
	@Column(name = "NAMA_BARANG", nullable = true, length = 255)
	public String namaBarang;
	
	@Column(name = "HARGA_BELI", nullable = true, length = 255)
	public int hargaBeli;
	
	@Column(name = "QUANTITY", nullable = true, length = 255)
	public int quantity;
	
	@Column(name = "TOTAL_HARGA", nullable = true, length = 255)
	public int totalHarga;
	
	public DetailPembelian() {}

	public DetailPembelian(Integer id, String kodePembelian, String kodeBarang, String namaBarang, int hargaBeli,
			int quantity, int totalHarga) {
		super();
		this.id = id;
		this.kodePembelian = kodePembelian;
		this.kodeBarang = kodeBarang;
		this.namaBarang = namaBarang;
		this.hargaBeli = hargaBeli;
		this.quantity = quantity;
		this.totalHarga = totalHarga;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getKodePembelian() {
		return kodePembelian;
	}

	public void setKodePembelian(String kodePembelian) {
		this.kodePembelian = kodePembelian;
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

	public int getHargaBeli() {
		return hargaBeli;
	}

	public void setHargaBeli(int hargaBeli) {
		this.hargaBeli = hargaBeli;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTotalHarga() {
		return totalHarga;
	}

	public void setTotalHarga(int totalHarga) {
		this.totalHarga = totalHarga;
	}
	
}
