package com.gabriel.ezequiel.ionicbackend.resources.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class PedidoDto implements Serializable{
	private static final long serialVersionUID = -8503270104265122248L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Date dataDoPedido;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "pedido")
	private PagamentoDto pagamento;
	
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private ClienteDto cliente;
	@ManyToOne
	@JoinColumn(name = "endereco_de_entrega_id")
	private EnderecoDto enderecoDeEntrega;
	
	
	public PedidoDto(Integer id, Date dataDoPedido, ClienteDto cliente,
			EnderecoDto enderecoDeEntrega) {
		super();
		this.id = id;
		this.dataDoPedido = dataDoPedido;
		this.cliente = cliente;
		this.enderecoDeEntrega = enderecoDeEntrega;
	}
	public PedidoDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getDataDoPedido() {
		return dataDoPedido;
	}
	public void setDataDoPedido(Date dataDoPedido) {
		this.dataDoPedido = dataDoPedido;
	}
	public PagamentoDto getPagamento() {
		return pagamento;
	}
	public void setPagamento(PagamentoDto pagamento) {
		this.pagamento = pagamento;
	}
	public ClienteDto getCliente() {
		return cliente;
	}
	public void setCliente(ClienteDto cliente) {
		this.cliente = cliente;
	}
	public EnderecoDto getEnderecoDeEntrega() {
		return enderecoDeEntrega;
	}
	public void setEnderecoDeEntrega(EnderecoDto enderecoDeEntrega) {
		this.enderecoDeEntrega = enderecoDeEntrega;
	}
	
	
}
