package aula;

public class Professor
	extends Pessoa{

	@Override
	public float getSalario() {
		return ((super.getSalario() * 0.15f) +
				super.getSalario());
	}

}
