package aula1;

public class ExercicioProcessadorMain {

	public static void main(String[] args) {
		Processador p1 = new Processador();
		p1.setFrequencia(400);
		p1.setMarca("Intel");
		Processador p2 = new Processador();
		p2.setFrequencia(400);
		p2.setMarca("Intel");
		
		Computador c1 = new Computador();
		c1.setModelo("modelo 1");
		c1.setProcessador(p1);
		
		Computador c2 = new Computador();
		c2.setModelo("modelo 1");
		c2.setProcessador(p2);
		
		System.out.println(c1.getModelo());
		System.out.println(c1.getProcessador().exibirDetalhes());

		System.out.println(c2.getModelo());
		System.out.println(c2.getProcessador().exibirDetalhes());

		System.out.println("sao iguais: " + c1.equals(c2));
	
	}

}
