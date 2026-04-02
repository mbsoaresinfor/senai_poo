package trabalho;

import java.util.ArrayList;
import java.util.Scanner;

public class ModuloProduto {
	private Scanner teclado = new Scanner(System.in);
	
	private ArrayList<Produto> lista =
			new ArrayList<Produto>();
	
	public void cadastrar() {
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

	}

	public void buscar() {

	}

	public void remocao() {

	}
}
