package com.gabriel.ezequiel.ionicbackend.resources.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriel.ezequiel.ionicbackend.resources.dto.CategoriaDTO;
import com.gabriel.ezequiel.ionicbackend.resources.repository.CategoriaRepository;
import com.gabriel.ezequiel.ionicbackend.resources.service.exception.ObjectNotFoundException;

@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository reporsitorio;
	
	public CategoriaDTO buscar(Integer id) {
		Optional<CategoriaDTO> response = reporsitorio.findById(id);
		return response.orElseThrow(()-> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + CategoriaDTO.class.getName()));
		
	}

}
