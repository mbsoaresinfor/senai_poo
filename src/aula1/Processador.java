package aula1;

import java.util.Objects;

public class Processador {
	
	private String marca;
	private double frequencia; 
	
	@Override
	public int hashCode() {
		return Objects.hash(frequencia, marca);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Processador other = (Processador) obj;
		return Double.doubleToLongBits(frequencia) == Double.doubleToLongBits(other.frequencia)
				&& Objects.equals(marca, other.marca);
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public double getFrequencia() {
		return frequencia;
	}



	public void setFrequencia(double frequencia) {
		this.frequencia = frequencia;
	}



	public String exibirDetalhes() {
		return "Marca: " + marca +
				" Frequência: " + frequencia;
	}

}
