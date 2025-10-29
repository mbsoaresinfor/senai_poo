package aula;

import java.util.ArrayList;

public class ExercicioAula12_2_Main {

	public static void main(String[] args) {
		ArrayList<Veiculo> frotaMista =
				new ArrayList<Veiculo>();
		
		Moto moto= new Moto();
		Carro carro = new Carro("");
		Bicicleta bike = new Bicicleta();
		
		
		frotaMista.add(bike);
		frotaMista.add(carro);
		frotaMista.add(moto);
		// polimorfismo
		for(Veiculo v : frotaMista) {
			v.acelerar();
		}
		
//		testarAceleracao(bike);
//		testarAceleracao(moto);
//		testarAceleracao(carro);
		

	}
	// polimorfismo
	public static void testarAceleracao(Veiculo veiculo) {
		veiculo.acelerar();
	}

}
