package aula1;

public class Cliente {

	// definicao das variaveis
	public String cpf;
	public String cnpj; 
	public String nome;
	public String email;
	public String endereco;
	public int idade;
	public String nacionalidade;
	
	// definicao dos metodos
	
	public boolean eBrasileiro() {
	
		if(nacionalidade.equals("brasileira") ||
				nacionalidade.equals("brasileiro")) {
			return true;
		}else {
			return false;
		}		
	}
	
	public boolean eArgentivo() {
		
		if(nacionalidade.equals("argentino") ||
				nacionalidade.equals("argentina")) {
			return true;
		}else {
			return false;
		}		
	}
	
	public boolean eMaiorIdade() {
		return idade >= 18 ? true : false;
	}
	
	public String eIdosa() {
		if(idade >= 65) {
			return "é idosa";
		}else {
			return "não idosa";
		}
	}
	
}
