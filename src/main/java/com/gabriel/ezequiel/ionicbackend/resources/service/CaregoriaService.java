package com.gabriel.ezequiel.ionicbackend.resources.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriel.ezequiel.ionicbackend.resources.dto.CategoriaDTO;
import com.gabriel.ezequiel.ionicbackend.resources.repository.CategoriaRepository;

@Service
public class CaregoriaService {
	@Autowired
	private CategoriaRepository reporsitorio;
	
	public Optional<CategoriaDTO> buscar(Integer id) {
		Optional<CategoriaDTO> response = reporsitorio.findById(id);
		
		return response;
		
	}

}
