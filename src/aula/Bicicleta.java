package aula;

public class Bicicleta {

	public int velocidade;
	public int marcha;
	
	public Bicicleta() {}
	
	public Bicicleta(int velocidade, int marcha) {
		super();
		this.velocidade = velocidade;
		this.marcha = marcha;
	}
	

	
	
	public void imprimirEstado() {
		System.out.println("A velocidade da bicicleta é " + 
				velocidade + " e sua marcha é " + marcha);
	}
	
	public void acelerar() {
		System.out.println("A bicicleta vai acelerar....");
	}
	
	public void frear() {
		System.out.println("A bicicleta está freando....");
	}
}
