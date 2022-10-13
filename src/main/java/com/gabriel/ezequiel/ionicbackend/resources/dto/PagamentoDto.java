package com.gabriel.ezequiel.ionicbackend.resources.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import com.gabriel.ezequiel.ionicbackend.resources.dto.enums.TipoEstadoPagamento;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class PagamentoDto implements Serializable{
	private static final long serialVersionUID = -562944531042109895L;
	
	@Id
	private Integer id;
	private TipoEstadoPagamento estadoPagamento;
	
	@OneToOne
	@JoinColumn(name="pedido_id")
	@MapsId
	private PedidoDto pedido;
	
	public PagamentoDto() {
	}

	public PagamentoDto(Integer id, TipoEstadoPagamento estadoPagamento, PedidoDto pedido) {
		super();
		this.id = id;
		this.estadoPagamento = estadoPagamento;
		this.pedido = pedido;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TipoEstadoPagamento getEstadoPagamento() {
		return estadoPagamento;
	}

	public void setEstadoPagamento(TipoEstadoPagamento estadoPagamento) {
		this.estadoPagamento = estadoPagamento;
	}

	public PedidoDto getPagamento() {
		return pedido;
	}

	public void setPagamento(PedidoDto pedido) {
		this.pedido = pedido;
	}
	
	
	
	
	

}
