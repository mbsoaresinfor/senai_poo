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
	
	public void mostrarMedia() {
		float media = calcularMedia();
		System.out.println("O aluno " + nome + " tem a média " + media);
	}
	
	public void mostrarResultado() {
		float media = calcularMedia();
		if(media >= 6) {
			System.out.println("Aluno " + nome + " APROVADO");
		}else {
			System.out.println("Aluno " + nome + " REPROVADO");
		}
	}
	
	
}
