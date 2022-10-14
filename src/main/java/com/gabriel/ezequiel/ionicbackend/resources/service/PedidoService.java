package com.gabriel.ezequiel.ionicbackend.resources.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriel.ezequiel.ionicbackend.resources.dto.CategoriaDTO;
import com.gabriel.ezequiel.ionicbackend.resources.dto.PedidoDto;
import com.gabriel.ezequiel.ionicbackend.resources.repository.PedidoRepository;
import com.gabriel.ezequiel.ionicbackend.resources.service.exception.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository reporsitorio;
	
	public PedidoDto buscar(Integer id) {
		Optional<PedidoDto> response = reporsitorio.findById(id);
		return response.orElseThrow(()-> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + CategoriaDTO.class.getName()));
		
	}

}
