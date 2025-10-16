package aula;

// classe filha de cliente
public class ClienteFisica
	extends Cliente{
	
	private String cpf;
	private String rg;
	
	@Override
	public String getNome() {
		return "Pessoa: " +  super.getNome();
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
}
