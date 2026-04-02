package aula1;

public class NotaAluno {

	private String nome;
	private float nota1;
	private float nota2;
	
	
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
		if(nota1 >= 0 && nota1 <= 10) {
			this.nota1 = nota1;
		}
	}


	public float getNota2() {
		return nota2;
	}


	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}


	public void mostrarDadosAluno() {
		float media = (nota1+nota2)/2;
		String dados = "Nome Aluno: ";
		dados.concat(nome).concat("\n");
		dados.concat("Média: ")
		.concat(Float.toString(media))
		.concat("\n");
		if(media >= 6) {
			dados.concat("Aprovado");
		}else {
			dados.concat("Reprovado");
		}
		
		System.out.println(dados);
	}
	
}
