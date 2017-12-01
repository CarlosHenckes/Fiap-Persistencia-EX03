package br.com.fiap.test;

import br.com.fiap.entity.Pedido;
import br.com.fiap.helper.PedidoHelper;

public class FindPedidoTest {

	/**
	 * Classe de teste que retorna um pedido com base no seu id
	 * @param args
	 * @return toString de pedido
	 */
	public static void main(String[] args) {
		
		PedidoHelper helper = new PedidoHelper();
		Pedido p = helper.findPedidoById(2);
		
		helper.encerrar();
		System.out.println(p.toString());
	}

}
