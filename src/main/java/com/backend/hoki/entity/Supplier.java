package com.backend.hoki.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "M_SUPPLIER")
public class Supplier {

	@Column(name="ID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "KODE_SUPPLIER", nullable = true, length = 255)
	public String kodeSupplier;
	
	@Column(name = "NAMA_SUPPLIER", nullable = true, length = 255)
	public String namaSupplier;
	
	@Column(name = "LINK_SUPPLIER", nullable = true, length = 255)
	public String linkSupplier;
	
	public Supplier() {}

	public String getKodeSupplier() {
		return kodeSupplier;
	}

	public void setKodeSupplier(String kodeSupplier) {
		this.kodeSupplier = kodeSupplier;
	}



	public Supplier(Integer id, String kodeSupplier, String namaSupplier, String linkSupplier) {
		super();
		this.id = id;
		this.kodeSupplier = kodeSupplier;
		this.namaSupplier = namaSupplier;
		this.linkSupplier = linkSupplier;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNamaSupplier() {
		return namaSupplier;
	}

	public void setNamaSupplier(String namaSupplier) {
		this.namaSupplier = namaSupplier;
	}

	public String getLinkSupplier() {
		return linkSupplier;
	}

	public void setLinkSupplier(String linkSupplier) {
		this.linkSupplier = linkSupplier;
	}

}
