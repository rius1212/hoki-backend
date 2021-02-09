package com.backend.hoki.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.hoki.entity.Kategori;

@Repository
public interface KategoriRepository  extends JpaRepository<Kategori, Integer>{

}
