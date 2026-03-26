package aula1;

import java.util.Scanner;

public class NotaFiscalMain {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		NotaFiscal notaFiscal = new NotaFiscal();

		while(true) {
			System.out.println("1 cadastrar");
			System.out.println("2 relatório");
			System.out.println("3 total da nota");
			System.out.println("5 sair ");
			
			int opcao = teclado.nextInt();
			if(opcao == 1) {
				System.out.println("Digit nome do produto: ");
				String nome = teclado.next();
				System.out.println("Digit preço do produto: ");
				float preco = teclado.nextFloat();
				notaFiscal.cadastrar(nome, preco);
			}else if(opcao == 2) {
				notaFiscal.relatorio();
			}else if(opcao == 3) {
				float totalNota = notaFiscal.calcularTotalNota();
				System.out.println("Total no nota R$ " + totalNota);
			}else if(opcao == 5) {
				break;
			}else {
				System.out.println("opção inválida ");				
			}			
		}

	}

}
