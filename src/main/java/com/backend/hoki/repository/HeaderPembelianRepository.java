package com.backend.hoki.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.hoki.entity.HeaderPembelian;

@Repository
public interface HeaderPembelianRepository extends JpaRepository<HeaderPembelian, Integer>{

}
