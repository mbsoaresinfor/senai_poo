package aula1;

public class ExercicioProdutoListaMain {

	public static void main(String[] args) {

		Produto p1 = new Produto();
		p1.setPreco(30);
		Produto p2 = new Produto();
		p2.setPreco(40);
		Produto p3 = new Produto();
		p3.setPreco(50);
		
		Pedido pedido = new Pedido();
		pedido.adicionarProduto(p1);
		pedido.adicionarProduto(p2);
		pedido.adicionarProduto(p3);
		
		System.out.println("total do pedido: "+
				pedido.calcularTotal());

	}

}
