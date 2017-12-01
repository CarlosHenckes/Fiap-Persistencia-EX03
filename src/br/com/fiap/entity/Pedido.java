package br.com.fiap.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_pedido")
public class Pedido implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idt_pedido")
	private int idPedido;

	@Column(name="dat_pedido")
	private Date data;
	
	@Column(name="des_produto")
	private String descricao;
	
	@Column(name="val_preco")
	private double valor;
	
	@ManyToOne
	@JoinColumn(name="idt_cliente")
	private Cliente cliente;
	
	public Pedido() {
	}

	public Pedido(Date data, String descricao, double valor, Cliente cliente) {
		this.data = data;
		this.descricao = descricao;
		this.valor = valor;
		this.cliente = cliente;
	}

	public Pedido(int idPedido, Date data, String descricao, double valor, Cliente cliente) {
		this.idPedido = idPedido;
		this.data = data;
		this.descricao = descricao;
		this.valor = valor;
		this.cliente = cliente;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return idPedido +"--"+ data +"--"+ descricao +"--"+ valor +"--"+ cliente.toString();
	}
}
