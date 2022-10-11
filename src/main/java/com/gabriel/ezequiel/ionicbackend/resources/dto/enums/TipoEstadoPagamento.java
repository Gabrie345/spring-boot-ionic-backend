package com.gabriel.ezequiel.ionicbackend.resources.dto.enums;

public enum TipoEstadoPagamento {

	PENDENTE(1, "PENDENTE"),
	QUITADO(2,"PESSOAJURIDICA"),
	CANCELADO(2,"CANCELADO");
	
	private int codigo;
	private String descricao;
	
	private TipoEstadoPagamento(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoEstadoPagamento toEnum (Integer codigo) {
		if(codigo==null)return null;
		for(TipoEstadoPagamento x : TipoEstadoPagamento.values()) {
			if(codigo.equals(x.getCodigo())) return x;
		}
		throw new IllegalArgumentException("Id Invalido : " + codigo);
	}
	
}
