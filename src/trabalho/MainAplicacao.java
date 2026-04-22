package trabalho;

import java.util.Scanner;

public class MainAplicacao {

	static Scanner teclado = new Scanner(System.in);
	static ModuloProduto moduloProduto 
		= new ModuloProduto();
	static ModuloCliente moduloCliente = new ModuloCliente();
	static ModuloEstoque moduloEstoque =
			new ModuloEstoque(moduloProduto);
	
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
				moduloCliente();
			} else if (op.equals("3")) {
				moduloEstoque();
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

	private static void moduloEstoque() {
		while (true) {
			System.out.println("MODULO ESTOQUE");
			System.out.println("1. Cadastro estoque");
			System.out.println("2. Relatorio estoque");
			System.out.println("3. Busca no estoque ");
			System.out.println("4. Atualizacao no estoque");
			System.out.println("5. Voltar");
			String op = teclado.next();
			if (op.equals("1")) {
				moduloEstoque.cadastrar();
			} else if (op.equals("2")) {
				moduloEstoque.relatorio();
			} else if (op.equals("3")) {
				
			} else if (op.equals("4")) {
				
			} else if (op.equals("5")) {
				break;
			} else {
				System.out.println("opção invalida");
			}
		}
		
	}

	private static void moduloCliente() {
		while (true) {
			System.out.println("MODULO CLIENTE");
			System.out.println("1. Cadastro cliente");
			System.out.println("2. Relatorio cliente");
			System.out.println("3. Busca de cliente ");
			System.out.println("4. Remoção de cliente");
			System.out.println("5. Voltar");
			String op = teclado.next();
			if (op.equals("1")) {
				moduloCliente.cadastrar();
			} else if (op.equals("2")) {
				moduloCliente.relatorio();
			} else if (op.equals("3")) {
				moduloCliente.buscar();
			} else if (op.equals("4")) {
				moduloCliente.remocao();
			} else if (op.equals("5")) {
				break;
			} else {
				System.out.println("opção invalida");
			}
		}
		
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
