package com.gabriel.ezequiel.ionicbackend;

import java.text.SimpleDateFormat;
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
import com.gabriel.ezequiel.ionicbackend.resources.dto.ItemPedidoDto;
import com.gabriel.ezequiel.ionicbackend.resources.dto.PagamentoBoletoDto;
import com.gabriel.ezequiel.ionicbackend.resources.dto.PagamentoCartaoDto;
import com.gabriel.ezequiel.ionicbackend.resources.dto.PagamentoDto;
import com.gabriel.ezequiel.ionicbackend.resources.dto.PedidoDto;
import com.gabriel.ezequiel.ionicbackend.resources.dto.ProdutoDTO;
import com.gabriel.ezequiel.ionicbackend.resources.dto.enums.TipoCliente;
import com.gabriel.ezequiel.ionicbackend.resources.dto.enums.TipoEstadoPagamento;
import com.gabriel.ezequiel.ionicbackend.resources.repository.CategoriaRepository;
import com.gabriel.ezequiel.ionicbackend.resources.repository.CidadeRepository;
import com.gabriel.ezequiel.ionicbackend.resources.repository.ClienteRepository;
import com.gabriel.ezequiel.ionicbackend.resources.repository.EnderecoRepository;
import com.gabriel.ezequiel.ionicbackend.resources.repository.EstadoRepository;
import com.gabriel.ezequiel.ionicbackend.resources.repository.ItemPedidoRepository;
import com.gabriel.ezequiel.ionicbackend.resources.repository.PagamentoRepository;
import com.gabriel.ezequiel.ionicbackend.resources.repository.PedidoRepository;
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
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@Autowired
	private PagamentoRepository pagamentoRepository;
	
	@Autowired
	private ItemPedidoRepository itemPedidoRepository;
	
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
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		PedidoDto pedido1 = new PedidoDto(null, simpleDateFormat.parse("30/09/2017 10:32"),cli1,e1);
		PedidoDto pedido2 = new PedidoDto(null, simpleDateFormat.parse("30/09/2017 10:32"),cli1,e2);
		
		PagamentoCartaoDto pagamento1 = new PagamentoCartaoDto(null,TipoEstadoPagamento.QUITADO, pedido1, 1);
		pedido1.setPagamento(pagamento1);
		
		PagamentoBoletoDto pagamento2 = new PagamentoBoletoDto(null,TipoEstadoPagamento.QUITADO,pedido2,simpleDateFormat.parse("30/09/2019 00:00"),simpleDateFormat.parse("30/09/2022 00:00"));
		pedido2.setPagamento(pagamento2);
		
		cli1.getPedidos().addAll(Arrays.asList(pedido1, pedido2));
		pedidoRepository.saveAll(Arrays.asList(pedido1,pedido2));
		pagamentoRepository.saveAll(Arrays.asList(pagamento1,pagamento2));
		
		ItemPedidoDto itemPedido1 = new ItemPedidoDto(pedido1,p1,0.00,1,1000.00);
		ItemPedidoDto itemPedido2 = new ItemPedidoDto(pedido1,p2,0.00,1,3000.00);
		ItemPedidoDto itemPedido3 = new ItemPedidoDto(pedido2,p2,100.00,1,5000.00);
		
		pedido1.getItemPedido().addAll(Arrays.asList(itemPedido1, itemPedido2));
		pedido2.getItemPedido().addAll(Arrays.asList(itemPedido3));
		
		p1.getItemPedido().addAll(Arrays.asList(itemPedido1));
		p2.getItemPedido().addAll(Arrays.asList(itemPedido3));
		p3.getItemPedido().addAll(Arrays.asList(itemPedido2));
		
		itemPedidoRepository.saveAll(Arrays.asList(itemPedido1,itemPedido2,itemPedido3));
		
	}

}
