package com.gabriel.ezequiel.ionicbackend.resources.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.gabriel.ezequiel.ionicbackend.resources.dto.enums.TipoEstadoPagamento;

@Entity
public class PagamentoDto implements Serializable{
	private static final long serialVersionUID = -562944531042109895L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private TipoEstadoPagamento estadoPagamento;
	private PagamentoDto pagamento;
	
	public PagamentoDto() {
	}

	public PagamentoDto(Integer id, TipoEstadoPagamento estadoPagamento, PagamentoDto pagamento) {
		super();
		this.id = id;
		this.estadoPagamento = estadoPagamento;
		this.pagamento = pagamento;
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

	public PagamentoDto getPagamento() {
		return pagamento;
	}

	public void setPagamento(PagamentoDto pagamento) {
		this.pagamento = pagamento;
	}
	
	
	
	
	

}
