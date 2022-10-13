package com.gabriel.ezequiel.ionicbackend.resources.dto;

import javax.persistence.Entity;

import com.gabriel.ezequiel.ionicbackend.resources.dto.enums.TipoEstadoPagamento;

@Entity
public class PagamentoCartaoDto  extends PagamentoDto{
	private static final long serialVersionUID = 562944531042109895L;
	
	private int numeroDeParcelas;

	public PagamentoCartaoDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PagamentoCartaoDto(Integer id, TipoEstadoPagamento estadoPagamento, PedidoDto pedido) {
		super(id, estadoPagamento, pedido);
		// TODO Auto-generated constructor stub
	}

	public int getNumeroDeParcelas() {
		return numeroDeParcelas;
	}

	public void setNumeroDeParcelas(int numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}
	
	
}
