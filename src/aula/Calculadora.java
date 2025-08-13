package aula;

public class Calculadora {

	// variaveis
	float n1,n2;
	String ultimaOperacao;
	
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
