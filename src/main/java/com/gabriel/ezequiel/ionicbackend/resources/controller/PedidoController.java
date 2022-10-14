package com.gabriel.ezequiel.ionicbackend.resources.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gabriel.ezequiel.ionicbackend.resources.dto.ClienteDto;
import com.gabriel.ezequiel.ionicbackend.resources.dto.PedidoDto;
import com.gabriel.ezequiel.ionicbackend.resources.service.PedidoService;

@RestController
@RequestMapping(value="/pedidos")
public class PedidoController {
	
	@Autowired
	private PedidoService service;
	
	@RequestMapping(value= "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
			PedidoDto response = service.buscar(id);
			return ResponseEntity.ok().body(response);

	}

}
