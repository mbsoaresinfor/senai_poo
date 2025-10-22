package aula;

public class Moto extends Veiculo{

	private String nomeMoto;
	private Motor motor; // composição
	
	
	
	@Override
	public void acelerar() {
		System.out.println("A moto está acelerando "
				+ "rapidamente e fazendo barulho!");
	}
	public String getNomeMoto() {
		return nomeMoto;
	}
	public void setNomeMoto(String nomeMoto) {
		this.nomeMoto = nomeMoto;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
}
