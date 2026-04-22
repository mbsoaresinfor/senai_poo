package aula1;

public class ExercicioCarroMotorMain {

	public static void main(String[] args) {
		Carro gol = new Carro();
		Motor m1 = new Motor();
		m1.setTipo("1.0");
		Motor m2 = new Motor();
		m2.setTipo("2.0");
		
		gol.setMotor(m1);
		
		System.out.println(gol.getMotor().getTipo());
		gol.setMotor(m2);
		System.out.println(gol.getMotor().getTipo());
		

	}

}
