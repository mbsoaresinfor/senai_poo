package trabalho;

import java.util.ArrayList;
import java.util.Scanner;



public class ModuloProduto {
	private Scanner teclado = new Scanner(System.in);
	
	private ArrayList<Produto> lista =
			new ArrayList<Produto>();
	
	public void cadastrar() {
		System.out.println("CADASTRO DE PRODUTO");		
		System.out.println("Digite codigo ");
		int codigo = teclado.nextInt();
		System.out.println("Digite nome ");
		String nome = teclado.next();
		System.out.println("Digite preço ");
		double preco = teclado.nextDouble();
		if(nome.length() < 3 || nome.length() > 30) {
			System.out.println("Nome invalido");
			return;
		}
		if(preco < 1 || preco > 10000) {
			System.out.println("preco invalido");
			return;
		}
		
		Produto produto = new Produto();
		produto.setCodigo(codigo);
		produto.setNome(nome);
		produto.setCodigo(codigo);
		lista.add(produto);
		System.out.println("Produto cadastrado com sucesso");
		
	}

	public void relatorio() {
		System.out.println("RELATÓRIO DE PRODUTOS");
		for(Produto produto : lista) {
			System.out.println("Nome: " + produto.getNome());
			System.out.println("Codigo: " + produto.getCodigo());
			System.out.println("Preço r$ : " + produto.getPreco());
			System.out.println("---------------------------------");
		}
	}

	public void buscar() {
		System.out.println("BUSCA DE PRODUTO");		
		System.out.println("Digite codigo do produto: ");
		int codigo = teclado.nextInt();
		boolean achou = false;
		for(Produto produto : lista) {
			if(codigo == produto.getCodigo()) {
				System.out.println("Produto localizado...");
				System.out.println("Nome: " + produto.getNome());
				System.out.println("Codigo: " + produto.getCodigo());
				System.out.println("Preço r$ : " + produto.getPreco());
				achou = true;
			}
		}
		if(achou == false) {
			System.out.println("Produto não localizado");			
		}
	}

	public void remocao() {
		System.out.println("REMOÇÃO DE PRODUTO");		
		System.out.println("Digite codigo do produto: ");
		int codigo = teclado.nextInt();
		boolean resultado = lista.removeIf(obj -> obj.getCodigo() == codigo);
		if(resultado) {
			System.out.println("Produdo removido com sucesso");
		}else {
			System.out.println("Produdo não localizado");
		}
	}
}
