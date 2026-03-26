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
		System.out.println("RELATÓRIO");
		String dados = "";
		String resultado = "";
		for(int cont=0; cont < contador;cont++) {
			resultado = dados.concat("Produto ")
			.concat(Integer.toString(cont+1))
			.concat(": ").concat(nomesItens[cont])
			.concat("\n").concat("Preço: ")
			.concat(Float.toString(precosItens[cont]))
			.concat("\n")
			.concat("-----------------------");
			System.out.println(resultado);
		}
		
	}
	
	public float calcularTotalNota() {
		float total=0;
		for(int i=0; i < contador;i++) {
			total = total + precosItens[i];
		}
		return total;
	}
	
}
