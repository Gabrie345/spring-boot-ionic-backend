package com.gabriel.ezequiel.ionicbackend;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gabriel.ezequiel.ionicbackend.resources.dto.CategoriaDTO;
import com.gabriel.ezequiel.ionicbackend.resources.dto.CidadeDto;
import com.gabriel.ezequiel.ionicbackend.resources.dto.ClienteDto;
import com.gabriel.ezequiel.ionicbackend.resources.dto.EnderecoDto;
import com.gabriel.ezequiel.ionicbackend.resources.dto.EstadoDto;
import com.gabriel.ezequiel.ionicbackend.resources.dto.ProdutoDTO;
import com.gabriel.ezequiel.ionicbackend.resources.dto.enums.TipoCliente;
import com.gabriel.ezequiel.ionicbackend.resources.repository.CategoriaRepository;
import com.gabriel.ezequiel.ionicbackend.resources.repository.CidadeRepository;
import com.gabriel.ezequiel.ionicbackend.resources.repository.ClienteRepository;
import com.gabriel.ezequiel.ionicbackend.resources.repository.EnderecoRepository;
import com.gabriel.ezequiel.ionicbackend.resources.repository.EstadoRepository;
import com.gabriel.ezequiel.ionicbackend.resources.repository.ProdutoRepository;

@SpringBootApplication
public class SpringBootIonicBackendApplication implements CommandLineRunner{

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootIonicBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		CategoriaDTO cat1 = new CategoriaDTO(null, "Informática");
		CategoriaDTO cat2 = new CategoriaDTO(null, "Escritório");
		
		ProdutoDTO p1 = new ProdutoDTO(null, "Computador", 2000.00);
		ProdutoDTO p2 = new ProdutoDTO(null, "Impressora", 800.00);
		ProdutoDTO p3 = new ProdutoDTO(null, "Mouse", 80.00);
		
		cat1.getProduto().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProduto().addAll(Arrays.asList(p2));
		
		p1.getCategoria().addAll(Arrays.asList(cat1));
		p2.getCategoria().addAll(Arrays.asList(cat1, cat2));
		p3.getCategoria().addAll(Arrays.asList(cat1));
				
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3));

		EstadoDto est1 = new EstadoDto(null, "Minas Gerais");
		EstadoDto est2 = new EstadoDto(null, "São Paulo");
		
		CidadeDto c1 = new CidadeDto(null, "Uberlândia", est1);
		CidadeDto c2 = new CidadeDto(null, "São Paulo", est2);
		CidadeDto c3 = new CidadeDto(null, "Campinas", est2);
		
		est1.getCidades().addAll(Arrays.asList(c1));
		est2.getCidades().addAll(Arrays.asList(c2, c3));

		estadoRepository.saveAll(Arrays.asList(est1, est2));
		cidadeRepository.saveAll(Arrays.asList(c1, c2, c3));
		
		ClienteDto cli1 = new ClienteDto(null, "Maria Silva", "maria@gmail.com", "36378912377", TipoCliente.PESSOAFISICA);
		
		cli1.getTelefones().addAll(Arrays.asList("27363323", "93838393"));
		
		EnderecoDto e1 = new EnderecoDto(null, "Rua Flores", "300", "Apto 303", "Jardim", "38220834", cli1, c1);
		EnderecoDto e2 = new EnderecoDto(null, "Avenida Matos", "105", "Sala 800", "Centro", "38777012", cli1, c2);
		
		cli1.getEnderecos().addAll(Arrays.asList(e1, e2));
		
		clienteRepository.saveAll(Arrays.asList(cli1));
		enderecoRepository.saveAll(Arrays.asList(e1, e2));
	}

}
