
package aula1;

import java.util.ArrayList;

public class ComparacalhoObjetosMain {

	public static void main(String[] args) {

		
		Cliente c1 = new Cliente();
		c1.setCpf("ab");
		Cliente c2 = new Cliente();
		Produto p = new Produto();
		c2.setCpf("ab");
		
		boolean resultado = c1.equals(c2);
		
		System.out.println("clientes são iguais: " + resultado);
		
		ArrayList<Cliente> lista = new ArrayList<Cliente>();
		lista.add(c1);
		lista.add(c2);
		for(Cliente c : lista) {
			System.out.println(c.getNome());
		}
		
		
		lista.remove(c1);
		for(Cliente c : lista) {
			System.out.println(c.getNome());
		}

	}

}
