package com.gabriel.ezequiel.ionicbackend.resources.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gabriel.ezequiel.ionicbackend.resources.dto.CategoriaDTO;

@Repository
public interface  CategoriaRepository extends JpaRepository<CategoriaDTO, Integer> {
	

}
