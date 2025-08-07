package aula;

public class Aplicacao {

	public static void main(String[] args) {

		// instanciar uma classe (classe objeto = new classe())
		NotaAluno notaAluno = new NotaAluno();
		notaAluno.nome = "marcelo";
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
		

	}

}
