package aula;

public class NotaAluno {
	// VARIAVEIS
	private String nome;
	private float nota1,nota2;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getNota1() {
		return nota1;
	}

	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}

	public float getNota2() {
		return nota2;
	}

	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}

	public NotaAluno (String nome) {
		this.nome = nome;
	}
	
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
