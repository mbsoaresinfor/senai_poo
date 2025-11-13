package aula;

public class Calculadora {

	// variaveis
	private float n1,n2;
	private String ultimaOperacao;
	
	public float getN1() {
		return n1;
	}

	public void setN1(float n1) {
		this.n1 = n1;
	}

	public float getN2() {
		return n2;
	}

	public void setN2(float n2) {
		this.n2 = n2;
	}

	public String getUltimaOperacao() {
		return ultimaOperacao;
	}

	public void setUltimaOperacao(String ultimaOperacao) {
		this.ultimaOperacao = ultimaOperacao;
	}

	// metodos
	public float somar(float a,float b) {
		ultimaOperacao ="somar";
		n1 = a;
		n2 = b;
		float soma = a + b;
		return soma;
	}
	
	public float subtrair(float a,float b) {
		ultimaOperacao ="subtrair";
		n1 = a;
		n2 = b;
		float sub = a - b;
		return sub;
	}
	
	public int divisao(int a, int b) {
		return a / b;
	}
	
	public void mostrarUltimaOperacao() {
		if(ultimaOperacao == null) {
			System.out.println("NÃO FOI CHAMADO NENHUMA OPERAÇÃO");
		}else {
			System.out.println("Última operação: " + ultimaOperacao);
		}
		
	}
	
	public void mostrarUltimosValores() {
		System.out.println("N1 = " + n1 + " N2 = " + n2);
	}
	
}
