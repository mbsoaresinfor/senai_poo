package aula1;

public class Carro {

	String marca;
	String modelo;
	Float preco;
	
	public void mostrarDadosCarro() {
		String dados = "Marca: " + marca + " Modelo: " + modelo + " Preço R$ " + preco;
		System.out.println(dados);
	}
}
