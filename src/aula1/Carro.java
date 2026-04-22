package aula1;

public class Carro {

	String marca;
	String modelo;
	Float preco;
	private Motor motor;
	
	
	
	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public Float getPreco() {
		return preco;
	}



	public void setPreco(Float preco) {
		this.preco = preco;
	}



	public Motor getMotor() {
		return motor;
	}



	public void setMotor(Motor motor) {
		this.motor = motor;
	}



	public void mostrarDadosCarro() {
		String dados = "Marca: " + marca + " Modelo: " + modelo + " Preço R$ " + preco;
		System.out.println(dados);
	}
}
