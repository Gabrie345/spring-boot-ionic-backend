package com.gabriel.ezequiel.ionicbackend.resources.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class EnderecoDto implements Serializable{
	private static final long serialVersionUID = 4636189416162941863L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String logrado;
	private String numero;
	private String complemento;
	private String bairro;
	private String cep;
	@ManyToOne
	@JoinColumn(name ="cliente_id")
	private ClienteDto cliente;
	@ManyToOne
	@JoinColumn(name ="cidade_id")
	private CidadeDto cidade;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLogrado() {
		return logrado;
	}
	public void setLogrado(String logrado) {
		this.logrado = logrado;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public ClienteDto getCliente() {
		return cliente;
	}
	public void setCliente(ClienteDto cliente) {
		this.cliente = cliente;
	}
	public CidadeDto getCidade() {
		return cidade;
	}
	public void setCidade(CidadeDto cidade) {
		this.cidade = cidade;
	}
	public EnderecoDto(Integer id, String logrado, String numero, String complemento, String bairro, String cep,
			ClienteDto cliente, CidadeDto cidade) {
		super();
		this.id = id;
		this.logrado = logrado;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
		this.cliente = cliente;
		this.cidade = cidade;
	}
	public EnderecoDto() {
	}
	
	
}
