package aula;

import java.util.ArrayList;

public class Venda {

	private ArrayList<ItemVenda> listaProdutos = 
			new ArrayList<ItemVenda>();
	private String nomeCliente;
	
	

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public ArrayList<ItemVenda> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(ArrayList<ItemVenda> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
	
	public void adicionarItem(ItemVenda itemVenda) {
		listaProdutos.add(itemVenda);
	}
	
	public ArrayList<ItemVenda> listaItensVenda(){
		return listaProdutos;
	}
	
	public int totalItens() {
		return listaProdutos.size();
	}
	
}
