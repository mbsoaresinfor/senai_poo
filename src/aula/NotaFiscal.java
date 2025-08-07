package aula;

public class NotaFiscal {
	// VARIAVEIS (da classe).
	String nome1,nome2,nome3,nome4,nome5;
	float preco1,preco2,preco3,preco4,preco5;
	
	// METODOS
	public void totalNota() {
		float total = preco1 + preco2 + preco3 + preco4 +preco5;
		System.out.println("Total da nota R$ " + total);
	}
	
	public void relatorio() {
		System.out.println("RELATÓRIO");
		System.out.println("Item 1: " + nome1 + " Preço R$ " + preco1);
		System.out.println("Item 2: " + nome2 + " Preço R$ " + preco2);
		System.out.println("Item 3: " + nome3 + " Preço R$ " + preco3);
		System.out.println("Item 4: " + nome4 + " Preço R$ " + preco4);
		System.out.println("Item 5: " + nome5 + " Preço R$ " + preco5);
	}
	
	
	
}
