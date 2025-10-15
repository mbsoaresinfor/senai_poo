package aula;

public class Diretor
	extends Pessoa{

	@Override
	public float getSalario() {		
		return ((super.getSalario() * 0.20f) +
				super.getSalario());
	}
	
	

}
