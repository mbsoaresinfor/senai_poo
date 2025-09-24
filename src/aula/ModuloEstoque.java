package aula;

import java.util.ArrayList;

public class ModuloEstoque {

	private ArrayList<Estoque> listaEstoque = new ArrayList<Estoque>();
	
	private ModuloProduto moduloProduto;
	
	public ModuloEstoque(ModuloProduto moduloProduto) {
		this.moduloProduto = moduloProduto;
	}
	
	public boolean cadastarEstoque(int codigoProduto, int quantidade) {
		Produto produto = moduloProduto.buscarProduto(codigoProduto);
		if(produto == null) {
			System.out.println("Produto não cadastrado no módulo Produto.");
			return false;
		}
		
		for(Estoque estoque : listaEstoque) {
			if(estoque.getProduto().getCodigo() == 
					codigoProduto) {
				System.out
				.println("Produto já está "
						+ "cadastrado no estoque");
				return false;
			}
		}
		
		Estoque estoque = new Estoque();
		estoque.setProduto(produto);
		estoque.setQuantidade(quantidade);
		
		listaEstoque.add(estoque);
		System.out.println("Produto " + produto.getNome() +  " cadastrado "
				+ " com " + quantidade  + " itens no estoque.");
		return true;
	}
	
	public void listarEstoque() {
		System.out.println("Relatório do Estoque");
		for(Estoque estoque : listaEstoque) {
			System.out.println("Produto: " + 
					estoque.getProduto().getNome());
			System.out.println("Total no estoque: " + 
					estoque.getQuantidade());
			System.out.println("-----------------------");
		}
	}
}
