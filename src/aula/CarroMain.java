package aula;

public class CarroMain {

	public static void main(String[] args) {
		Carro carro1 = new Carro("gol1");
		carro1.setNome("gol");
		carro1.setPotencia(1000);
		carro1.setMarca("vw");
		System.out.println("Carro 1 nome: " + carro1.getNome() );
		System.out.println("Carro 1 potencia: " + carro1.getPotencia() );
		System.out.println("Carro 1 marca: " + carro1.getMarca());
		
		Carro carro2 = new Carro("gol2");
		carro2.setPotencia(1000);
		carro2.setMarca("vw");
		
		if(carro1.equals(carro2)) {
			System.out.println("Os carros são iguais");
		}else {
			System.out.println("Os carros NÃO são iguais");
		}
		

	}

}
