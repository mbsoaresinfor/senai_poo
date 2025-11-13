package aula;

import java.util.ArrayList;

public class ModuloVenda {

	private ModuloProduto moduloProduto;
	private ModuloEstoque moduloEstoque;
	private ModuloCliente moduloCliente;
	private ArrayList<Venda> listaVenda = new ArrayList<Venda>();
	
	public ModuloVenda(ModuloProduto moduloProduto,
			ModuloEstoque moduloEstoque,
			ModuloCliente moduloCliente) {
		this.moduloProduto = moduloProduto;
		this.moduloEstoque = moduloEstoque;
		this.moduloCliente = moduloCliente;
	}
	
	public void realizarVenda(Venda venda) 
			throws RealizarVendaException {
		
		Cliente cliente = moduloCliente.buscarCliente(venda.getNomeCliente());
		if(cliente == null) {
			throw new RealizarVendaException("Cliente não "
					+ "existe para a realização da compra.");			
		}
		// verifica limite de itens por venda.
		if(venda.totalItens() > 3) {
			throw new RealizarVendaException("Limite de produtos na venda é 3");			
		}
		// verifica se item (produto) existe no cadastro
		for(ItemVenda item: venda.listaItensVenda()) {
			Produto produto = moduloProduto.buscarProduto(item.getCodigoProduto());
			if(produto == null) {
				throw new RealizarVendaException("Produto de codigo "+ item.getCodigoProduto()+ " não existe");				
			}
		}
		// verifica se quantidade existe no estoque.
		for(ItemVenda item: venda.listaItensVenda()) {
			int quantEstoque = moduloEstoque.buscarProduto(item.getCodigoProduto());
			if(item.getQuantidade() > quantEstoque) {
				throw new RealizarVendaException("Item de codigo: " + item.getCodigoProduto() + " não "
						+ "tem a quantidade " + item.getQuantidade() + " no estoque");				
			}
		}
		// atualiza o estoque.
		for(ItemVenda item: venda.listaItensVenda()) {
			moduloEstoque.atualizarEstoque(item.getCodigoProduto(),
					item.getQuantidade());
		}
		
		listaVenda.add(venda);
		System.out.println("Compra realizada com sucesso para o cliente " + cliente.getNome());		
		
	}
	
	public void relatorio1() {
		int cont=1;
		System.out.println("RELATORIO VENDA 1");
		for(Venda venda: listaVenda) {
			System.out.println("VENDA "+ (cont));
			for(ItemVenda item : venda.listaItensVenda()) {
				Produto produto = moduloProduto.buscarProduto(item.getCodigoProduto());
				System.out.println(produto.getNome() + " R$ " + produto.getPreco());
			}
			System.out.println("------------------");
			cont++;			
		}		
	}
	public void relatorio2() {
		int cont=1;
		System.out.println("RELATORIO VENDA 2");
		for(Venda venda: listaVenda) {
			System.out.println("VENDA "+ (cont));
			for(ItemVenda item : venda.listaItensVenda()) {
				Produto produto = moduloProduto.buscarProduto(item.getCodigoProduto());
				System.out.println(produto.getNome());
			}
			System.out.println("Total de itens na venda: " + venda.listaItensVenda().size());
			System.out.println("------------------");
			cont++;			
		}		
	}
}
