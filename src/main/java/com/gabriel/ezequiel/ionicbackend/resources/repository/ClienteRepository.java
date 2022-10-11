package com.gabriel.ezequiel.ionicbackend.resources.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gabriel.ezequiel.ionicbackend.resources.dto.ClienteDto;

@Repository
public interface  ClienteRepository extends JpaRepository<ClienteDto, Integer> {
	

}
