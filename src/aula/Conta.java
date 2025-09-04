package aula;

import java.util.Objects;

public class Conta {

	private float saldo = 200; // ELA ESTA ENCAPSULADA.
	private int numeroConta;
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(numeroConta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		return numeroConta == other.numeroConta;
	}

	public void sacar(float valor) {
		if(valor < saldo) {
			saldo = saldo - valor;
		}
	}
	
	// METODOS GET/SET
	
	public float getSaldo() { // retorna o valor da variavel saldo.
		return saldo;
	}
	
	public void setSaldo(float valor) { // altera o valor da variavel
		saldo = valor;
	}
	
	
	
	private void teste() {} 
}
