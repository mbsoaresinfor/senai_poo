package aula;

import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {

		Scanner TECLADO = new Scanner(System.in);
		
		// instanciar uma classe (classe objeto = new classe())
		NotaAluno notaAluno = new NotaAluno();
		//notaAluno.nome = "marcelo";
		notaAluno.nota1 = 6f;		
		notaAluno.nota2 = 7f;		
		notaAluno.mostrarMedia();
		notaAluno.mostrarResultado();
				
		// outro objeto
		NotaAluno notaAluno2 = new NotaAluno();
		notaAluno2.nome = "pedro";
		notaAluno2.nota1 = 5f;
		notaAluno2.nota2 = 3f;		
		notaAluno2.mostrarMedia();
		notaAluno2.mostrarResultado();
		
		NotaAluno notaAluno3 = new NotaAluno();
		notaAluno3.nome = "MARIA";
		notaAluno3.nota1 = 10f;
		notaAluno3.nota2 = 5f;		
		notaAluno3.mostrarMedia();
		notaAluno3.mostrarResultado();
		
		// ################
		
		Calculadora calculadora = new Calculadora(); // instanciar.
		calculadora.mostrarUltimaOperacao();
		float soma = calculadora.somar(5f, 5f);
		System.out.println("resultado soma 1 = " + soma);
		calculadora.mostrarUltimaOperacao();
		
		Calculadora calculadora2 = new Calculadora(); // instanciar.
		calculadora2.mostrarUltimosValores();
		float subtrair = calculadora2.subtrair(10f, 5f);
		System.out.println("resultado subtrair 2 = " + subtrair);
		
		// ###################
	}

}
