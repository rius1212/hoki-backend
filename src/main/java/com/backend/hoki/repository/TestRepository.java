package com.backend.hoki.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.backend.hoki.entity.Test;

@Repository
public interface TestRepository extends JpaRepository<Test, Integer>{

	@Query(value = "SELECT * FROM test_jpa WHERE name_jpa = ?1", nativeQuery = true)
	 Test caricari(String name);
}
