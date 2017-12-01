package br.com.fiap.test;

import java.util.Date;

import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Pedido;
import br.com.fiap.helper.PedidoHelper;

public class InsertPedidoTest {

	/**
	 * Classe teste que persiste um pedido fornecendo um número 
	 * de cliente
	 * 
	 * @param args
	 * @return String msg
	 */
	public static void main(String[] args) {
		PedidoHelper helper = new PedidoHelper();
		Cliente c = new Cliente();
		c.setIdCliente(1);
		String msg = helper.criarPedido(new Pedido(new Date(), "Ar condicionado", 950.0, c));
		helper.encerrar();
		System.out.println(msg);
	}

}
