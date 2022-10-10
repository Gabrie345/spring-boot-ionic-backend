package com.gabriel.ezequiel.ionicbackend.resources.dto;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CidadeDto implements Serializable{
	private static final long serialVersionUID = -967062100597427511L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	
	@ManyToOne
	@JoinColumn(name ="estado_id")
	private EstadoDto estado;
	
	public CidadeDto(Integer id, String nome, EstadoDto estado) {
		super();
		this.id = id;
		this.nome = nome;
		this.estado = estado;
	}
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
	public EstadoDto getEstado() {
		return estado;
	}
	public void setEstado(EstadoDto estado) {
		this.estado = estado;
	}
	
	public CidadeDto() {
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
		CidadeDto other = (CidadeDto) obj;
		return Objects.equals(id, other.id);
	}

}
