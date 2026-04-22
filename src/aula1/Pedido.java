package aula1;

import java.util.ArrayList;

public class Pedido {

	private ArrayList<Produto> lista = new 
			ArrayList<Produto>();
	
	public void adicionarProduto(Produto p) {
		lista.add(p);
	}
	
	public double calcularTotal() {
		double total = 0;
		for(Produto p : lista) {
			total = total + p.getPreco();
		}
		return total;
	}
	
}
