package aula;

import java.util.Scanner;

public class TratamentoExceptionMain2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		try {
			System.out.println("Digite um número: ");
			int valorA = teclado.nextInt();
			validarValor(valorA);
			System.out.println("fim do programa");
		} catch (Exception e) {
			System.out.println("Ocorreu um erro: " + e.getMessage());
			e.printStackTrace();
		}finally {
			teclado.close();
		}

	}
	
	static void validarValor(int valor) throws Exception {
		if(valor > 10) {
			throw new Exception("O valor é maior que 10");
		}
	}

}
