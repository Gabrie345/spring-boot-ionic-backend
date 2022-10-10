package com.gabriel.ezequiel.ionicbackend.resources.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.gabriel.ezequiel.ionicbackend.resources.dto.enums.TipoCliente;

@Entity
public class ClienteDto implements Serializable {
	private static final long serialVersionUID = 3721061002179843416L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String email;
	private String cpfouCnpj;
	private Integer tipocliente;
	private List<EnderecoDto> endereco = new ArrayList<>();
	
	private Set<String> telefones = new HashSet<>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpfouCnpj() {
		return cpfouCnpj;
	}

	public void setCpfouCnpj(String cpfouCnpj) {
		this.cpfouCnpj = cpfouCnpj;
	}

	public TipoCliente getTipocliente() {
		return TipoCliente.toEnum(tipocliente);
	}

	public void setTipocliente(TipoCliente tipocliente) {
		this.tipocliente = tipocliente.getCodigo();
	}

	public List<EnderecoDto> getEndereco() {
		return endereco;
	}

	public void setEndereco(List<EnderecoDto> endereco) {
		this.endereco = endereco;
	}

	public Set<String> getTelefones() {
		return telefones;
	}

	public void setTelefones(Set<String> telefones) {
		this.telefones = telefones;
	}

	public ClienteDto(Integer id, String nome, String email, String cpfouCnpj, TipoCliente tipocliente,
			Set<String> telefones) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.cpfouCnpj = cpfouCnpj;
		this.tipocliente = tipocliente.getCodigo();
		this.telefones = telefones;
	}

	public ClienteDto() {
	}
	
	

}
