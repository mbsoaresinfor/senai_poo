package aula;

public class TratamentoExceptionMain3 {
	
	public static void main(String[] args) {
		
		try {
			eImpar(3);
			System.out.println("é par");
		} catch (ImparException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void eImpar(int valor) throws ImparException{
		int resultado = valor % 2 ;
		if(resultado != 0) {
			throw new ImparException(valor + " é impar");
		}
	}
}
