package aula;

import java.util.Objects;

public abstract class Produto {

	// caracteristicas = variaveis
	private int  codigo;
	private String nome;
	private float preco;
	private boolean temEstoque;
	private int totalEstoque;
	private float desconto;
	
	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return codigo == other.codigo;
	}

	public int getTotalEstoque() {
		return totalEstoque;
	}
	
	public void setTotalEstoque(int valor) {
		totalEstoque = valor;
	}
	
	public boolean getTemEstoque() {
		return temEstoque;
	}
	
	public void setTemEstoque(boolean valor) {
		temEstoque = valor;
	}
	
	public void setPreco(float valor) {
		preco = valor;
	}
	
	public float getPreco() {
		return preco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String valor) {
		nome = valor;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int valor) {
		codigo = valor;
	}
	
	
	public float getDesconto() {
		return desconto;
	}

	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}

	public Produto(String nome,float preco) {
		this.nome = nome;
		this.preco = preco;
	} 
	
	// comportamentos = metodos = funções
	
	public boolean ePrecoMaior100() {
		if(preco > 100) {
			return true;
		}else {
			return false;
		}		
	}
	
	public float calcularPrecoDesconto() {
		float desconto = 0.05f;
		float precoFinal = preco - ( preco * desconto);
		return precoFinal;				
	}
	
	public void temEstoque1() {
		if(totalEstoque > 0) {
			System.out.println("Produto tem no estoque");
		}else {
			System.out.println("Produto NÃO tem no estoque");
		}
	}
	
	public boolean temEstoque2() {
		if(totalEstoque > 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public abstract void tipoProduto();
	
	
	
	
	
	
	
	
	
}
