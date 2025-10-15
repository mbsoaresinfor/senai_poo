package aula;

public class PolimorfismoMain1 {

	public static void main(String[] args) {
		Professor prof = new Professor();
		prof.setSalario(100);
		
		Diretor diretor = new Diretor();
		diretor.setSalario(100);

		mostrarSalario(prof);
		mostrarSalario(diretor);
	}
	
	public static 
			void mostrarSalario(Pessoa pessoa) {
		System.out
		.println("Salario: " 
		+ pessoa.getSalario());
	}

}
