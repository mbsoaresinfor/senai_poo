package aula;

import java.util.Scanner;

public class TratamentoExceptionMain1 {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		Scanner teclado = null;
		
		try {
			teclado = new Scanner(System.in);
			System.out.println("Digite um número: ");
			int valorA = teclado.nextInt();
			System.out.println("Digite outro número: ");
			int valorB = teclado.nextInt();
			int divisao = calculadora.divisao(valorA, valorB);
			System.out.println("Divisão: " + divisao);
			
		} catch (ArithmeticException e) {		
			System.out.println("Ocorreu um erro: "
					+ e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Ocorreu um erro generico: "
					+ e.getMessage());
		}finally {
			System.out.println("Limpando os recursos");
			teclado.close();					
		}
		
		System.out.println("FIM DO PROGRAMA");		

	}

}
