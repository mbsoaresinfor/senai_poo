package aula;

public class ComposicaoMain {

	public static void main(String[] args) {

		Carro carro = new Carro("gol");
		Motor motorCarro = new Motor();
		motorCarro.setCilindrada(1000);
		motorCarro.setPotencia(100);
		
		Fabricante fabricante = new Fabricante();
		fabricante.setNome("WV");
		motorCarro.setFabricante(fabricante);
				
		carro.setMotor(motorCarro);
		System.out.println("A potencia do meu carro :"
				+ carro.getNome() + " é: " + 
				carro.getMotor().getPotencia() + "\n" + 
				"Nome fabricante: " + 
				carro.getMotor().getFabricante().getNome());
		
		/////

		Moto moto = new Moto();
		moto.setNomeMoto("CG 150");
		
		Motor motorMoto = new Motor();
		motorMoto.setCilindrada(150);
		motorMoto.setPotencia(150);
		
		moto.setMotor(motorMoto);
		System.out.println("A potencia da minha moto :"
				+ moto.getNomeMoto() + " é: " + 
				moto.getMotor().getPotencia());
		
		

	}

}
