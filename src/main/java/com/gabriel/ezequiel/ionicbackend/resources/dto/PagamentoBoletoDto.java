package com.gabriel.ezequiel.ionicbackend.resources.dto;

import java.util.Date;

import javax.persistence.Entity;

import com.gabriel.ezequiel.ionicbackend.resources.dto.enums.TipoEstadoPagamento;

@Entity
public class PagamentoBoletoDto extends PagamentoDto {
	private static final long serialVersionUID = 562944531042109895L;
	
	
	private Date dataVencimento;
	private Date dataPagamento;
	
	public PagamentoBoletoDto(Integer id, TipoEstadoPagamento estadoPagamento, PedidoDto pedido) {
		super(id, estadoPagamento, pedido);
		// TODO Auto-generated constructor stub
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	
}
