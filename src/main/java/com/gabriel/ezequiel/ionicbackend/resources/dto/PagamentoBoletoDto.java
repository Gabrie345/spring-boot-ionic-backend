package com.gabriel.ezequiel.ionicbackend.resources.dto;

import java.util.Date;

import com.gabriel.ezequiel.ionicbackend.resources.dto.enums.TipoEstadoPagamento;

public class PagamentoBoletoDto extends PagamentoDto {
	private static final long serialVersionUID = 562944531042109895L;
	
	
	private Date dataVencimento;
	private Date dataPagamento;
	
	
	public PagamentoBoletoDto(Integer id, TipoEstadoPagamento estadoPagamento, 
			PagamentoDto pagamento,Date dataVencimento,Date dataPagamento) {
		super(id, estadoPagamento, pagamento);
		this.dataPagamento = dataPagamento;
		this.dataVencimento = dataVencimento;
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
