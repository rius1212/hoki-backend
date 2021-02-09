package com.backend.hoki.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.hoki.entity.DetailPembelian;

@Repository
public interface DetailPembelianRepository extends JpaRepository<DetailPembelian, Integer>{

}
