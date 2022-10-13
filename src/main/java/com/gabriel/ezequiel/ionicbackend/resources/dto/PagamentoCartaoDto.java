package com.gabriel.ezequiel.ionicbackend.resources.dto;

import javax.persistence.Entity;

import com.gabriel.ezequiel.ionicbackend.resources.dto.enums.TipoEstadoPagamento;

@Entity
public class PagamentoCartaoDto  extends PagamentoDto{
	private static final long serialVersionUID = 1L;
	
private Integer numeroDeParcelas;
	
	public PagamentoCartaoDto() {
	}

	public PagamentoCartaoDto(Integer id, TipoEstadoPagamento estado, PedidoDto pedido, Integer numeroDeParcelas) {
		super(id, estado, pedido);
		this.numeroDeParcelas = numeroDeParcelas;
	}

	public Integer getNumeroDeParcelas() {
		return numeroDeParcelas;
	}

	public void setNumeroDeParcelas(Integer numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}
	
	
	
}
