package aula;

public class RelatorioModuloProdutoImpl 
	implements RelatorioModuloProduto{

	private ModuloProduto modProduto;
	
	public RelatorioModuloProdutoImpl(ModuloProduto modProduto) {
		this.modProduto = modProduto;
	}
	
	@Override
	public void relatorioCompleto() {

		System.out.println("Relatório de Produtos - COMPLETO");
		for(Produto produto : modProduto.getListaProduto()) {
			if(produto instanceof ProdutoFisico) {
				System.out.println("Produto Físico");
			}
			if(produto instanceof ProdutoDigital) {
				System.out.println("Produto Digital");
			}
			System.out.println("Código: " + produto.getCodigo());
			System.out.println("Nome: " + produto.getNome());
			System.out.println("Preço: " + produto.getPreco());
			System.out.println("---------------------------");
		}
		
		
	}

	@Override
	public void relatorioSimples() {
		
		System.out.println("Relatório de Produtos - SIMPLES");
		for(Produto produto : modProduto.getListaProduto()) {
			if(produto instanceof ProdutoFisico) {
				System.out.println("Produto Físico");
			}
			if(produto instanceof ProdutoDigital) {
				System.out.println("Produto Digital");
			}
			
			System.out.println("Nome: " + produto.getNome());
			System.out.println("Preço: " + produto.getPreco());
			System.out.println("---------------------------");
		}
		
	}

}
