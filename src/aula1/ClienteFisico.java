package aula1;

import java.util.Objects;

public class ClienteFisico extends Cliente{

	
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClienteFisico other = (ClienteFisico) obj;
		return Objects.equals(cpf, other.cpf);
	}
	
	
	
	
}
