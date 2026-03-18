package aula1;

public class NotaFiscal {

	
	public String[] nomesItens = new String[5];
	public Float[] precosItens = new Float[5];
	public int contador;
	public final int MAX_ITENS = 5;
	
	public boolean cadastrar(String nome,Float preco) {
		if(contador >= MAX_ITENS) {
			System.out.println("Limite de itens atingido :(");
			return false;
		}
		
		nomesItens[contador] = nome;
		precosItens[contador] = preco;
		contador++;
		System.out.println("Item cadastrado com sucesso");
		return true;
	}
	
	public void relatorio() {
		String dados = "RELATÓRIO\n\n";
		for(int cont=0; cont < nomesItens.length;cont++) {
			dados.concat("Produto ")
			.concat(Integer.toString(cont+1));
			dados.concat(": ").concat(nomesItens[cont]);
			dados.concat("\n").concat("Preço: ");
			dados.concat(Float.toString(precosItens[cont]));
			dados.concat("\n");
			dados.concat("-----------------------");			
		}
		System.out.println(dados);
	}
}
