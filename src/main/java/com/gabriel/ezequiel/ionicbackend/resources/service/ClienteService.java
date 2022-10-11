package com.gabriel.ezequiel.ionicbackend.resources.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriel.ezequiel.ionicbackend.resources.dto.CategoriaDTO;
import com.gabriel.ezequiel.ionicbackend.resources.dto.ClienteDto;
import com.gabriel.ezequiel.ionicbackend.resources.repository.ClienteRepository;
import com.gabriel.ezequiel.ionicbackend.resources.service.exception.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository reporsitorio;
	
	public ClienteDto buscar(Integer id) {
		Optional<ClienteDto> response = reporsitorio.findById(id);
		return response.orElseThrow(()-> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + CategoriaDTO.class.getName()));
		
	}

}
