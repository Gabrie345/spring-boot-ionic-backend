package com.gabriel.ezequiel.ionicbackend;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gabriel.ezequiel.ionicbackend.resources.dto.CategoriaDTO;
import com.gabriel.ezequiel.ionicbackend.resources.dto.CidadeDto;
import com.gabriel.ezequiel.ionicbackend.resources.dto.EstadoDto;
import com.gabriel.ezequiel.ionicbackend.resources.dto.ProdutoDTO;
import com.gabriel.ezequiel.ionicbackend.resources.repository.CategoriaRepository;
import com.gabriel.ezequiel.ionicbackend.resources.repository.CidadeRepository;
import com.gabriel.ezequiel.ionicbackend.resources.repository.EstadoRepository;
import com.gabriel.ezequiel.ionicbackend.resources.repository.ProdutoRepository;

@SpringBootApplication
public class SpringBootIonicBackendApplication implements CommandLineRunner{

	@Autowired
	private CategoriaRepository reporsitorio;
	@Autowired
	private ProdutoRepository reporsitorioProduto;
	@Autowired
	private EstadoRepository estadoRepository;
	@Autowired
	private CidadeRepository cidadeRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootIonicBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		CategoriaDTO cat1 = new CategoriaDTO(1, "Informática");
		CategoriaDTO cat2 = new CategoriaDTO(2, "Escritório");
		
		ProdutoDTO p1 = new ProdutoDTO(3, "Computador", 2000.00);
		ProdutoDTO p2 = new ProdutoDTO(4, "Impressora", 800.00);
		ProdutoDTO p3 = new ProdutoDTO(5, "Mouse", 80.00);
		
		cat1.getProduto().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProduto().addAll(Arrays.asList(p2));
		
		p1.getCategoria().addAll(Arrays.asList(cat1));
		p2.getCategoria().addAll(Arrays.asList(cat1, cat2));
		p3.getCategoria().addAll(Arrays.asList(cat1));
		
		EstadoDto west2 = new EstadoDto(null, "Minas Gerais");
		EstadoDto west1 = new EstadoDto(null, "São paulo");
		CidadeDto cidade1 = new CidadeDto(null, "Uberaba", west2); 
		CidadeDto cidade2 = new CidadeDto(null, "Barueri", west1); 
		CidadeDto cidade3 = new CidadeDto(null, "Campinas", west1); 
		
		west2.getCidades().addAll(Arrays.asList(cidade1));
		west1.getCidades().addAll(Arrays.asList(cidade2, cidade3));
		
		reporsitorio.saveAll(Arrays.asList(cat1, cat2));
		reporsitorioProduto.saveAll(Arrays.asList(p1, p2, p3));
		estadoRepository.saveAll(Arrays.asList(west2, west1));
		cidadeRepository.saveAll(Arrays.asList(cidade1, cidade2, cidade3));
		
	}

}
