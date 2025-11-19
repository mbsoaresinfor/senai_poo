package aula;

public class Camada3 {

	public void processar(int a) throws Exception {
		if(a > 10) {
			throw new Exception("valor > 10");
		}
	}
	
}
