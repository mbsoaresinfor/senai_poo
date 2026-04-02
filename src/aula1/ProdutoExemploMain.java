package aula1;

import java.util.ArrayList;
import java.util.Scanner;

public class ProdutoExemploMain {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		//Produto[] vetorProd = new Produto[5];
		ArrayList<Produto> listaProd
			= new ArrayList<>();
		//int cont = 0;
		while (true) {
			
			Produto produto = new Produto();
			listaProd.add(produto);

			System.out.println("Digite codigo do produto ");
			int codigo = teclado.nextInt();			
			System.out.println("Digite nome do produto ");
			String nome = teclado.next();
			System.out.println("Digite preço do produto ");
			Float preco = teclado.nextFloat();
			System.out.println("Digite peso do produto ");
			Float peso = teclado.nextFloat();
			produto = new Produto(codigo, nome,  preco,peso);
			System.out.println("O nome do produto = " + produto.getNome());

			produto.mostrarDescricao();
			produto.verificarSeProdutoCaro();

			System.out.println("Deseja continuar [s/n]");
			String op = teclado.next();
			if (op.equals("n")) {
				break;
			}

		}

		// percorrendo todo vetor
		for (Produto produto : listaProd) {
			produto.mostrarDescricao();			
		}

		// buscando no vetor pelo codigo
		System.out.println("Digite codigo do produto para buscar");
		int codigo = teclado.nextInt();
		boolean achou = false;
		for (Produto produto : listaProd) {
			
			if(produto.getCodigo() == codigo) {
				System.out.println("produto localizado");
				achou = true;
			}
		}
		if(achou == false) {
			System.out.println("produto não localizado");
		}

	}

}
