package com.gabriel.ezequiel.ionicbackend.resources.dto;

import com.gabriel.ezequiel.ionicbackend.resources.dto.enums.TipoEstadoPagamento;

public class PagamentoCartãoDto  extends PagamentoDto{
	private static final long serialVersionUID = 562944531042109895L;
	
	private int numeroDeParcelas;


	public PagamentoCartãoDto(Integer id, TipoEstadoPagamento estadoPagamento, PagamentoDto pagamento, int numeroDeParcelas) {
		super(id, estadoPagamento, pagamento);
		this.numeroDeParcelas = numeroDeParcelas;
		// TODO Auto-generated constructor stub
	}


	public int getNumeroDeParcelas() {
		return numeroDeParcelas;
	}

	public void setNumeroDeParcelas(int numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}
	
	
	
	
	
}
