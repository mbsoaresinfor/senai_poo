package aula;

import java.util.Objects;

public class Bicicleta extends Veiculo{

	private  int velocidade;
	private int marcha;
	
		
	
	@Override
	public int hashCode() {
		return Objects.hash(marcha);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bicicleta other = (Bicicleta) obj;
		return marcha == other.marcha;
	}

	public int getMarcha() {
		return marcha;
	}
	
	public void setMarcha(int valor) {
		marcha = valor;
	}
	
	public void setVelocidade(int valor) {
		if(valor < 0) {
			System.out.println("velocidade negativa");
		}else {
			velocidade = valor;
		}
	}
	
	public int getVelocidade() {
		return velocidade;
	}
	
	
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
	
	
	
	public void frear() {
		System.out.println("A bicicleta "
				+ "está pedalando, acelerando com esforço físico.");
	}

	@Override
	public void acelerar() {
		System.out.println("A bicicleta vai acelerar....");
		
	}
}
