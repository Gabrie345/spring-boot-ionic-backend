package com.gabriel.ezequiel.ionicbackend.resources.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gabriel.ezequiel.ionicbackend.resources.dto.CategoriaDTO;
import com.gabriel.ezequiel.ionicbackend.resources.service.CaregoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaController {
	
	@Autowired
	private CaregoriaService service;
	
	@RequestMapping(value= "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Optional<CategoriaDTO> response = service.buscar(id);
		
		return ResponseEntity.ok().body(response);
		
	}

}
