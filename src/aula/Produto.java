package aula;

public class Produto {

	// caracteristicas = variaveis
	String nome;
	float preco;
	boolean temEstoque;
	int totalEstoque;
	
	// comportamentos = metodos = funções
	
	public boolean ePrecoMaior100() {
		if(preco > 100) {
			return true;
		}else {
			return false;
		}		
	}
	
	public float calcularPrecoDesconto() {
		float desconto = 0.05f;
		float precoFinal = preco - ( preco * desconto);
		return precoFinal;				
	}
	
	public void temEstoque1() {
		if(totalEstoque > 0) {
			System.out.println("Produto tem no estoque");
		}else {
			System.out.println("Produto NÃO tem no estoque");
		}
	}
	
	public boolean temEstoque2() {
		if(totalEstoque > 0) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	
	public void mostrarNOme() {
		System.out.println("Marcelo");
	}
	
	
	public int somar() {
		return 5 + 5;
	}
	
	public float somar2(float a, float b) {
		return a + b;
	}
	
	
	
	
	
	
}
