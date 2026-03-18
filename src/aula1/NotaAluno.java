package aula1;

public class NotaAluno {

	public String nome;
	public float nota1;
	public float nota2;
	
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
