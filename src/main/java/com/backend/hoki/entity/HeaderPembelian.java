package com.backend.hoki.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "T_HEADER_PEMBELIAN")
public class HeaderPembelian {
	
	@Column(name="ID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "KODE_PEMBELIAN", nullable = true, length = 255)
	public String kodePembelian;

	@Column(name = "TANGGAL_PEMBELIAN", nullable = true, length = 255)
	public String tanggalPembelian;
	
	@Column(name = "KODE_SUPPLIER", nullable = true, length = 255)
	public String kodeSupplier;

	@Column(name = "METODE_PEMBAYARAN", nullable = true, length = 255)
	public String metodePembayaran;

	@Column(name = "TOTAL_PEMBELIAN", nullable = true, length = 255)
	public int totalPembelian;

	@Column(name = "ONGKIR", nullable = true, length = 255)
	public int ongkir;

	@Column(name = "POTONGAN", nullable = true, length = 255)
	public int potongan;
	
	public HeaderPembelian() {}

	public HeaderPembelian(Integer id, String kodePembelian, String tanggalPembelian, String kodeSupplier,
			String metodePembayaran, int totalPembelian, int ongkir, int potongan) {
		super();
		this.id = id;
		this.kodePembelian = kodePembelian;
		this.tanggalPembelian = tanggalPembelian;
		this.kodeSupplier = kodeSupplier;
		this.metodePembayaran = metodePembayaran;
		this.totalPembelian = totalPembelian;
		this.ongkir = ongkir;
		this.potongan = potongan;
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

	public String getTanggalPembelian() {
		return tanggalPembelian;
	}

	public void setTanggalPembelian(String tanggalPembelian) {
		this.tanggalPembelian = tanggalPembelian;
	}

	public String getKodeSupplier() {
		return kodeSupplier;
	}

	public void setKodeSupplier(String kodeSupplier) {
		this.kodeSupplier = kodeSupplier;
	}

	public String getMetodePembayaran() {
		return metodePembayaran;
	}

	public void setMetodePembayaran(String metodePembayaran) {
		this.metodePembayaran = metodePembayaran;
	}

	public int getTotalPembelian() {
		return totalPembelian;
	}

	public void setTotalPembelian(int totalPembelian) {
		this.totalPembelian = totalPembelian;
	}

	public int getOngkir() {
		return ongkir;
	}

	public void setOngkir(int ongkir) {
		this.ongkir = ongkir;
	}

	public int getPotongan() {
		return potongan;
	}

	public void setPotongan(int potongan) {
		this.potongan = potongan;
	}

}
