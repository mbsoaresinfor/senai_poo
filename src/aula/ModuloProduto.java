package aula;

import java.util.Random;

// classe que gerencia os produtos.
public class ModuloProduto {

	public boolean salvarProduto(String nome,float preco) {
		if(nome.equals("") || nome.length() < 3 || nome.length() > 30) {
			System.out.println("Nome invalido. "
					+ "Nâo pode nome vazio ou menor 3 "
					+ "ou maior que 30 caracteres.");
			return false;
		}
		if(preco < 1 || preco > 10000) {
			System.out.println("Preço inválido."
					+ " Nâo pode ter preco menor que 1 ou maior que 10000");
			return false;
		}
		
		Produto produto = new Produto(nome,preco);		
		produto.codigo = new Random().nextInt();
		// TODO aqui vamos salvar na memoria, quando trabalhamos com 
		// as estruturas de dados.
		return true;		
	}
	
}
