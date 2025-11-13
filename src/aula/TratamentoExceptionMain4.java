package aula;

import java.util.ArrayList;

public class TratamentoExceptionMain4 {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		try {
			lista.get(4);
		}catch(Exception e) {
			System.out.println("vc tentou acessar uma posição"
					+ " no array que ainda não existe");
		}

	}

}
