package com.gabriel.ezequiel.ionicbackend.resources.dto;

import java.io.Serializable;
import java.util.Objects;

public class ItemPedidoDto implements Serializable{
	private static final long serialVersionUID = 3465340715234621771L;

	private ItemPedidoPK id = new ItemPedidoPK();
	
	private Double desconto;
	private Integer quantidade;
	private Double preco;
	
	public ItemPedidoDto(PedidoDto pedido, ProdutoDTO produto, Double desconto, Integer quantidade, Double preco) {
		super();
		id.setPedido(pedido);
		id.setProduto(produto);
		this.desconto = desconto;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	public PedidoDto getPedido(){
		return id.getPedido();
		
	}
	public ProdutoDTO getproduto(){
		return id.getProduto();
		
	}
	public ItemPedidoDto() {

	}
	public ItemPedidoPK getId() {
		return id;
	}
	public void setId(ItemPedidoPK id) {
		this.id = id;
	}
	public Double getDesconto() {
		return desconto;
	}
	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemPedidoDto other = (ItemPedidoDto) obj;
		return Objects.equals(id, other.id);
	}
	
	

}
