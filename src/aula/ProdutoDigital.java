package aula;

public class ProdutoDigital 
	extends Produto{

	public ProdutoDigital() {
		super("nome_produto",0);
	}

	public ProdutoDigital(String nome, float preco) {
		super(nome, preco);		
	}

	private long tamanhoPrograma;
	
	

	public long getTamanhoPrograma() {
		return tamanhoPrograma;
	}

	public void setTamanhoPrograma(long tamanhoPrograma) {
		this.tamanhoPrograma = tamanhoPrograma;
	}
	
	@Override
	public float getPreco() {
		return super.getPreco() 
				- (super.getDesconto() + 5);
	}

	@Override
	public void tipoProduto() {
		System.out.println("DIGITAL");
	}
	
	
	

}
