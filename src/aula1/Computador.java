package aula1;

import java.util.Objects;

public class Computador {

	private String modelo;
	private Processador processador;
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Processador getProcessador() {
		return processador;
	}
	public void setProcessador(Processador processador) {
		this.processador = processador;
	}
	@Override
	public int hashCode() {
		return Objects.hash(modelo, processador);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Computador other = (Computador) obj;
		return Objects.equals(modelo, other.modelo) && Objects.equals(processador, other.processador);
	}
	
	
	
}
