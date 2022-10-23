package com.example.ThiGK.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ThiGK.entity.TranThaiThanhEntity;

@Repository
public interface TranThaiThanhRepository extends JpaRepository<TranThaiThanhEntity, String> {

	
	
}
