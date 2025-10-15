package aula;

import java.util.ArrayList;
import java.util.Random;

// classe que gerencia os produtos.
public class ModuloProduto {

	private ArrayList<Produto> listaProduto = new ArrayList<Produto>();
	
	public ArrayList<Produto> getListaProduto(){
		return listaProduto;
	}
	
	public Produto buscarProduto(int codigo) {
		for(Produto produto : listaProduto) {
			if(codigo  == produto.getCodigo()) {
				return produto;
			}
		}
		return null;
	}
	public boolean removerProduto(int codigo) {
		return listaProduto
				.removeIf(obj -> obj.getCodigo() == codigo);		
	}
	
	public boolean salvarProduto(Produto produto) {
		if(produto.getNome().equals("") 
				|| produto.getNome().length() < 3 
				|| produto.getNome().length() > 30) {
			System.out.println("Nome invalido. "
					+ "Nâo pode nome vazio ou menor 3 "
					+ "ou maior que 30 caracteres.");
			return false;
		}
		if(produto.getPreco() < 1 || produto.getPreco() > 10000) {
			System.out.println("Preço inválido."
					+ " Nâo pode ter preco menor que 1 ou maior que 10000");
			return false;
		}
				
		produto.setCodigo(new Random().nextInt());
		
		listaProduto.add(produto);
		System.out.println("adicionado produto " + produto.getNome() 
			+ " na lista");
		
		return true;		
	}
	
}
