package aula1;
import java.util.Objects;
public class Cliente {

	// definicao das variaveis
	private String cpf;
	private String cnpj; 
	private String nome;
	private String email;	
	private int idade;
	private String nacionalidade;
	private Endereco endereco;
	
	
	
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

	public void setEndereco(Endereco endereco){
		this.endereco = endereco;
	}

	public Endereco getEndereco(){
		return endereco;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(cpf, other.cpf);
	}
	
}
