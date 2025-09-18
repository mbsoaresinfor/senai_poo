package aula;

public class Moto {

	private String nomeMoto;
	private Motor motor; // composição
	
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
