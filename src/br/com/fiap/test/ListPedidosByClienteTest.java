package br.com.fiap.test;

import br.com.fiap.entity.Pedido;
import br.com.fiap.helper.PedidoHelper;

public class ListPedidosByClienteTest {

	/**
	 * Classe de teste
	 * retorna uma lista de pedidos para um dado cliente
	 * @param args
	 * @return List<Pedido> toString
	 */
	public static void main(String[] args) {
		
		PedidoHelper helper = new PedidoHelper();
		for (Pedido pedido : helper.listPedidos(1)) {
			System.out.println(pedido.toString());
		}
		helper.encerrar();

	}

}
