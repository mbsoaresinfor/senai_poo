package aula1;

public class Produto {
	
	// definicao dos atributos
	private int codigo;
	private String nome;
	private double preco;
	private float peso;
	private Setor setor;
	
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
	
	public double getPreco() {
		return preco;
	}
	
	
	public float getPeso() {
		return peso;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
	}

	public void setSetor(Setor setor){
		this.setor = setor;
	}

	public Setor getSetor(){
		return setor;
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

	public void setPreco(double preco2) {
		this.preco = preco2;
	}
	
}
