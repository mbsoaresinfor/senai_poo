package aula;

public class NotaAluno {
	// VARIAVEIS
	String nome;
	float nota1,nota2;
	
	// METODOS
	public void mostrarNomeAluno() {
		
		System.out.println("NOme do aluno é: " + nome);
	}
	
	public float calcularMedia() {
		float media = (nota1+nota2) / 2;
		return media;
	}
	
	public String retornaNome() {
		if(nome == null) {
			return "ALUNO_SEM_NOME";
		}else {
			return nome;
		}
	}
	
	public void mostrarMedia() {
		float media = calcularMedia();		
		System.out.println("O aluno " + retornaNome() + " tem a média " + media);
		
	}
	
	public void mostrarResultado() {
		float media = calcularMedia();
		if(media >= 6) {
			System.out.println("Aluno " + retornaNome() + " APROVADO");
		}else {
			System.out.println("Aluno " + retornaNome() + " REPROVADO");
		}
	}
	
	
}
