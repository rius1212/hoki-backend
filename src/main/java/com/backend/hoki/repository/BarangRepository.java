package com.backend.hoki.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.hoki.entity.Barang;

@Repository
public interface BarangRepository extends JpaRepository<Barang, Integer>{

}
