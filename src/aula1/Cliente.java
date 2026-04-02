package aula1;

public class Cliente {

	// definicao das variaveis
	private String cpf;
	private String cnpj; 
	private String nome;
	private String email;
	private String endereco;
	private int idade;
	private String nacionalidade;
	
	
	
	// definicao dos metodos
	
	

	public boolean eBrasileiro() {
	
		if(nacionalidade.equals("brasileira") ||
				nacionalidade.equals("brasileiro")) {
			return true;
		}else {
			return false;
		}		
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
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
