package aula1;

import java.util.Scanner;

public class CalculadoraMain {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		Calculadora calculadora = new Calculadora();

		for (;;) {// laço infinito

			System.out.println("Selecione a operação da calculadora");
			System.out.println("1 SOMAR");
			System.out.println("2 SUBTRAIR");
			System.out.println("3 MULTIPLICAR");
			System.out.println("4 DIVIDIR");
			System.out.println("5 OPERACAOES REALIZADAS");
			System.out.println("10 SAIR");

			int opcao = teclado.nextInt();

			if (opcao == 1) {
				System.out.println("Digite o valor 1: ");
				float v1 = teclado.nextFloat();
				System.out.println("Digite o valor 2: ");
				float v2 = teclado.nextFloat();
				float resultado = calculadora.somar(v1, v2);
				System.out.println("Resultado da soma: " + resultado);
			} else if (opcao == 2) {
				System.out.println("Digite o valor 1: ");
				float v1 = teclado.nextFloat();
				System.out.println("Digite o valor 2: ");
				float v2 = teclado.nextFloat();
				float resultado = calculadora.subtrair(v1, v2);
				System.out.println("Resultado da subtração: " + resultado);
			} else if (opcao == 3) {
				System.out.println("Digite o valor 1: ");
				float v1 = teclado.nextFloat();
				System.out.println("Digite o valor 2: ");
				float v2 = teclado.nextFloat();
				float resultado = calculadora.multiplicar(v1, v2);
				System.out.println("Resultado da multiplicação: " + resultado);
			} else if (opcao == 4) {
				System.out.println("Digite o valor 1: ");
				float v1 = teclado.nextFloat();
				System.out.println("Digite o valor 2: ");
				float v2 = teclado.nextFloat();
				float resultado = calculadora.dividir(v1, v2);
				System.out.println("Resultado da divisão: " + resultado);
			} else if (opcao == 5) {
				// for tradicional = raiz
//			for(int i=0; i < calculadora.operacoes.length; i++) {
//				System.out.println(calculadora.operacoes[i]);
//			}

				// for foreach
				for (String valor : calculadora.operacoes) {
					if(valor != null) {
						System.out.println(valor);
					}
				}

			}else if(opcao == 10) {
				break;
			}
			else {
				System.out.println("opção inválida");
			}

		}

	}

}
