package trabalho;

import java.util.Scanner;

public class MainAplicacao {

	static Scanner teclado = new Scanner(System.in);
	static ModuloProduto moduloProduto 
		= new ModuloProduto();
	
	public static void main(String[] args) {

		while (true) {
			System.out.println("MODULO PRINCIPAL");
			System.out.println("1. Modulo Produto");
			System.out.println("2. Modulo Cliente");
			System.out.println("3. Modulo Estoque");
			System.out.println("4. Modulo Vendas");
			System.out.println("5. Sair");
			String op = teclado.next();

			if (op.equals("1")) {
				moduloProduto();
			} else if (op.equals("2")) {
				System.out.println("EM DESENVOLVIMENTO");
			} else if (op.equals("3")) {
				System.out.println("EM DESENVOLVIMENTO");
			} else if (op.equals("4")) {
				System.out.println("EM DESENVOLVIMENTO");
			} else if (op.equals("5")) {
				break;
			} else {
				System.out.println("opção invalida");
			}

		}

		System.out.println("PROGRAMA ENCERRADO");

	}

	private static void moduloProduto() {
		while (true) {
			System.out.println("MODULO PRODUTO");
			System.out.println("1. Cadastro Produto");
			System.out.println("2. Relatorio Produto");
			System.out.println("3. Busca de Produtos ");
			System.out.println("4. Remoção de Produtos");
			System.out.println("5. Voltar");
			String op = teclado.next();
			if (op.equals("1")) {
				moduloProduto.cadastrar();
			} else if (op.equals("2")) {
				moduloProduto.relatorio();
			} else if (op.equals("3")) {
				moduloProduto.buscar();
			} else if (op.equals("4")) {
				moduloProduto.remocao();
			} else if (op.equals("5")) {
				break;
			} else {
				System.out.println("opção invalida");
			}
		}

	}

}
