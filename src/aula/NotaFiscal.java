package aula;

import java.util.Objects;

public class NotaFiscal {
	// VARIAVEIS (da classe).
	private String nome1,nome2,nome3,nome4,nome5;
	private float preco1,preco2,preco3,preco4,preco5;
	private float numeroNotaFiscal;
	
	@Override
	public int hashCode() {
		return Objects.hash(numeroNotaFiscal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NotaFiscal other = (NotaFiscal) obj;
		return Float.floatToIntBits(numeroNotaFiscal) == Float.floatToIntBits(other.numeroNotaFiscal);
	}

	public String getNome1() {
		return nome1;
	}

	public void setNome1(String nome1) {
		this.nome1 = nome1;
	}

	public String getNome2() {
		return nome2;
	}

	public void setNome2(String nome2) {
		this.nome2 = nome2;
	}

	public String getNome3() {
		return nome3;
	}

	public void setNome3(String nome3) {
		this.nome3 = nome3;
	}

	public String getNome4() {
		return nome4;
	}

	public void setNome4(String nome4) {
		this.nome4 = nome4;
	}

	public String getNome5() {
		return nome5;
	}

	public void setNome5(String nome5) {
		this.nome5 = nome5;
	}

	public float getPreco1() {
		return preco1;
	}

	public void setPreco1(float preco1) {
		this.preco1 = preco1;
	}

	public float getPreco2() {
		return preco2;
	}

	public void setPreco2(float preco2) {
		this.preco2 = preco2;
	}

	public float getPreco3() {
		return preco3;
	}

	public void setPreco3(float preco3) {
		this.preco3 = preco3;
	}

	public float getPreco4() {
		return preco4;
	}

	public void setPreco4(float preco4) {
		this.preco4 = preco4;
	}

	public float getPreco5() {
		return preco5;
	}

	public void setPreco5(float preco5) {
		this.preco5 = preco5;
	}

	// METODOS
	public void totalNota() {
		float total = preco1 + preco2 + preco3 + preco4 +preco5;
		System.out.println("Total da nota R$ " + total);
	}
	
	public void relatorio() {
		System.out.println("RELATÓRIO");
		if(nome1 != null) {
			System.out.println("Item 1: " + nome1 + " Preço R$ " + preco1);
		}
		if(nome2 != null) {
			System.out.println("Item 2: " + nome2 + " Preço R$ " + preco2);
		}
		if(nome3 != null) {
			System.out.println("Item 3: " + nome3 + " Preço R$ " + preco3);
		}
		if(nome4 != null) {
			System.out.println("Item 4: " + nome4 + " Preço R$ " + preco4);
		}
		if(nome5 != null) {
			System.out.println("Item 5: " + nome5 + " Preço R$ " + preco5);
		}
	}
	
	
	
}
