package br.com.fiap.test;

import java.util.List;

import br.com.fiap.entity.Cliente;
import br.com.fiap.helper.ClienteHelper;

public class ListClientesTest {

	/**
	 * Classe test para listar todos os clientes cadastrados
	 * 
	 * @param args
	 * @return toString de cliente
	 */
	public static void main(String[] args) {
		
		ClienteHelper helper = new ClienteHelper();
		
		List<Cliente> c = helper.listClientes();
		for (Cliente cliente : c) {
			System.out.println(cliente.toString());
		}
		helper.encerrar();
	}

}
