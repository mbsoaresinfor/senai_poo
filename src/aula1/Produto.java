package aula1;

public class Produto {
	
	// definicao dos atributos
	private int codigo;
	private String nome;
	private float preco;
	private float peso;
	
	public Produto() {}
	
	public Produto(int codigo) {
		this.codigo = codigo;
	}
	
	public Produto(int codigo,String nome,float preco, float peso) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.peso = peso;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public float getPreco() {
		return preco;
	}
	
	public void setPreco(float preco) {
		this.peso = preco;
	}
	
	public float getPeso() {
		return peso;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	// definicao dos metodos
	
	public void mostrarDescricao() {
		System.out.println("Cod: " + codigo + " nome: " + nome + " R$ " + preco);
	}
	
	public void verificarSeProdutoCaro() {
		if(preco > 500) {
			System.out.println("Este produto é caro");
		}else {
			System.out.println("Este produto é baratinho");
		}
	}
	
}
