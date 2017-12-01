package br.com.fiap.helper;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.fiap.core.HibernateUtil;
import br.com.fiap.entity.Pedido;

/**
 * Classe auxiliar com métodos básicos como:
 * persistir um novo Pedido, retornar um pedido a partir de seu id
 * e uma listagem de pedidos por dado cliente
 * 
 * @author Henckes
 *
 */
public class PedidoHelper {

	Session session = null;
	Transaction transaction = null;

	public void encerrar(){
		session.close();
	}
	
	/**
	 * Metodo que persiste um novo pedido
	 * @param pedido
	 * @return String mensagem
	 */
	public String criarPedido(Pedido pedido){
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			transaction = session.beginTransaction();
			session.save(pedido);
			transaction.commit();
			return "novo pedido criado";
			
		} catch (Exception e) {
			return e.getMessage();
		}
	}
	
	/**
	 * Metodo que retorna um pedido a partir de seu id
	 * @param id
	 * @return objeto Pedido
	 */
	public Pedido findPedidoById(int id){
		Pedido p = new Pedido();
		session = HibernateUtil.getSessionFactory().getCurrentSession();
		transaction = session.beginTransaction();
		TypedQuery<Pedido> query = session.createQuery("from Pedido p where p.idPedido = :id", Pedido.class);
		query.setParameter("id", id);
		p = query.getSingleResult();
		return p;
	}
	
	/**
	 * Metodo que retorna uma lista de pedidos por dado cliente
	 * @param id
	 * @return List<pedido>
	 */
	public List<Pedido> listPedidos(int id){
		List<Pedido> pedidos = new ArrayList<Pedido>();
		session = HibernateUtil.getSessionFactory().getCurrentSession();
		transaction = session.beginTransaction();
		TypedQuery<Pedido> query = session.createQuery("from Pedido p where p.cliente.idCliente = :id", Pedido.class);
		query.setParameter("id", id);
		pedidos = query.getResultList();
		return pedidos;
	}
}
