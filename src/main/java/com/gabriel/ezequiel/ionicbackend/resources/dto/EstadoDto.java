package com.gabriel.ezequiel.ionicbackend.resources.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class EstadoDto implements Serializable{
	private static final long serialVersionUID = 6586972413656199250L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	
	@OneToMany(mappedBy = "estado")
	@JsonBackReference
	public List<CidadeDto> cidades = new ArrayList<>();
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
	public List<CidadeDto> getCidades() {
		return cidades;
	}
	public void setCidades(List<CidadeDto> cidades) {
		this.cidades = cidades;
	}
	public EstadoDto(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	public EstadoDto() {
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EstadoDto other = (EstadoDto) obj;
		return Objects.equals(id, other.id);
	}
}
