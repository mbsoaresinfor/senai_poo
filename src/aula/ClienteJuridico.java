package aula;

// essa classe é filha de cliente.
public class ClienteJuridico 
	extends Cliente{

	private String cnpj;
	private String inscricaoEstadual;
		
	@Override
	public String getNome() {
		return "Empresa: " + super.getNome();
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
	
	
}
