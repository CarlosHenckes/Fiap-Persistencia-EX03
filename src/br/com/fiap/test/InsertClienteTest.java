package br.com.fiap.test;

import br.com.fiap.entity.Cliente;
import br.com.fiap.helper.ClienteHelper;

public class InsertClienteTest {

	/**
	 * Classe de teste para persistir um cliente
	 * 
	 * @param args
	 * @return String message
	 */
	public static void main(String[] args) {
		
		String msg = new ClienteHelper()
						.salvar(new Cliente("Jil Henckes","jmvanini@uol.com.br"));
		System.out.println(msg);
	}

}
