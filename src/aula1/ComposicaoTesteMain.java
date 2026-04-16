
package aula1;

public class ComposicaoTesteMain {

	public static void main(String[] args) {

		Setor setor = new Setor();
		setor.setDescricao("eletrodomestico");
		
		Produto p1 = new Produto(1);
	
		
		System.out.println(p1.getNome());
		System.out.println(p1.getSetor().getDescricao() );
		
		Setor novoSetor = new Setor();
		novoSetor.setDescricao("descricao alterada");
		p1.setSetor(novoSetor);
		p1.setNome("tv alterado");
		System.out.println(p1.getNome());
		System.out.println(p1.getSetor().getDescricao() );
		

	}

}
