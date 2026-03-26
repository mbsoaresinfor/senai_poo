package aula1;

public class CarroMain {

	public static void main(String[] args) {

		Carro c1 = new Carro();
		c1.marca = "Vw";
		c1.modelo = "Fusca";
		c1.preco = 1500f;
		
		Carro c2 = new Carro();
		c2.marca = "Honda";
		c2.modelo = "Hrv";
		c2.preco = 2500f;
		
		c1.mostrarDadosCarro();
		c2.mostrarDadosCarro();
		

	}

}
