package aula;

public class Carro {

	public String nome;
	public String marca;
	public int potencia;
	public boolean estaParado;
	
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
