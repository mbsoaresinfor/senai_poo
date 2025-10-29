package aula;

public abstract class Pessoa {

	private float salario;

	public abstract float calcularSalarioAcrescimo();
	
	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
}
