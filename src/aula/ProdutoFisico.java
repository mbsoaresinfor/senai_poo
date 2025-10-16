package aula;

public class ProdutoFisico extends Produto {

	private long peso;
	private long tamanho;
	
	public ProdutoFisico(String nome, float preco) {
		super(nome, preco);
	}

	public long getPeso() {
		return peso;
	}

	public void setPeso(long peso) {
		this.peso = peso;
	}

	public long getTamanho() {
		return tamanho;
	}

	public void setTamanho(long tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public float getPreco() {
		return super.getPreco() 
				- (super.getDesconto() + 1);
	}
	
	
	

}
