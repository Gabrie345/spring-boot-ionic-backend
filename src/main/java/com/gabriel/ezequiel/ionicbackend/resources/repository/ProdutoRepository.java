package com.gabriel.ezequiel.ionicbackend.resources.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gabriel.ezequiel.ionicbackend.resources.dto.CategoriaDTO;
import com.gabriel.ezequiel.ionicbackend.resources.dto.ProdutoDTO;

@Repository
public interface  ProdutoRepository extends JpaRepository<ProdutoDTO, Integer> {
	

}
