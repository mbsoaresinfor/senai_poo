package aula;

import java.util.Objects;

public class Carro {

	private String nome;
	private String marca;
	private int potencia;
	private boolean estaParado;
	
	
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		return Objects.equals(nome, other.nome);
	}

	private void validarNome(String nome) {
		if(!nome.equals("")) {
			this.nome = nome;			
		}
	}
	
	public Carro(String valorNome) {
		validarNome(valorNome);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		validarNome(nome);		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		if(potencia > 0) {
			this.potencia = potencia;
		}
	}

	public boolean isEstaParado() {
		return estaParado;
	}

	public void setEstaParado(boolean estaParado) {
		this.estaParado = estaParado;
	}

	public void situacaoCarro() {
		if(estaParado == true) {
			System.out.println("O carro " + nome + " está parado");
		}else {
			System.out.println("O carro " + nome + " está andando");
		}
	}
	
	public void eCarroPopular() {
		if(potencia <= 1000) {
			System.out.println("ESte carro é popular");
		}else {
			System.out.println("ESte carro NÃO é popular");
		}
	}
	
}
