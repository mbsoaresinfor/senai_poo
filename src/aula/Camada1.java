package aula;

public class Camada1 {
	Camada2 camada2 = new Camada2();
	
	public static void main(String[] args) {
		new Camada1().processar(12);
	}
	
	public void processar(int a) {
		try {
			camada2.processar(a);
		} catch (Exception e) {
			System.out.println("Ocorreu um erro " + e.getMessage());
			e.printStackTrace();
		}
	}
	
}
