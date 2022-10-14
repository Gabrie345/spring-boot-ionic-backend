package com.gabriel.ezequiel.ionicbackend.resources.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class ProdutoDTO implements Serializable{
	private static final long serialVersionUID = -4315202284013382509L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private Double preco;
	
	@OneToMany(mappedBy = "id.produto")
	private Set<ItemPedidoDto> itemPedido = new HashSet<>();
	
	
	@JsonBackReference
	@ManyToMany
	@JoinTable(name = "PRODUTO_CATEGORIA", 
	joinColumns = @JoinColumn(name = "produto_id"),
	inverseJoinColumns = @JoinColumn(name = "categoria_id")
	)
	public List<CategoriaDTO> categoria = new ArrayList<>();
	
	public List<PedidoDto> getListaPedidos(){
		List<PedidoDto> lista = new ArrayList<>();
		for(ItemPedidoDto x : itemPedido) {
			lista.add(x.getPedido());
		}
		return lista;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public List<CategoriaDTO> getCategoria() {
		return categoria;
	}

	public void setCategoria(List<CategoriaDTO> categoria) {
		this.categoria = categoria;
	}

	public ProdutoDTO(Integer id, String nome, Double preco) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}

	public ProdutoDTO() {
	}

	public Set<ItemPedidoDto> getItemPedido() {
		return itemPedido;
	}

	public void setItemPedido(Set<ItemPedidoDto> itemPedido) {
		this.itemPedido = itemPedido;
	}
}
