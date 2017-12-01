package br.com.fiap.test;

import br.com.fiap.helper.ClienteHelper;


public class FindClienteTest {
	
	/**
	 * Classe de teste para encontrar um cliente por seu
	 * id único
	 * 
	 * @param args
	 * @return cliente information (toString)
	 * */
	public static void main(String[] args) {
		
		ClienteHelper helper = new ClienteHelper();
		System.out.println(helper.findClienteById(1).toString());
		helper.encerrar();
	}

}
