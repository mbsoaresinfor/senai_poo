package aula;

import java.util.Scanner;

public class ProjetoPraticoMain {

	static Scanner TECLADO = new Scanner(System.in);
	static final String MODULO_PRODUTO = "1";
	static final String MODULO_CLIENTE = "2";
	static final String MODULO_ESTOQUE = "3";
	static final String MODULO_VENDA = "4";
	static final String SAIR = "5";
	static ModuloProduto modProduto = new ModuloProduto();
	static ModuloCliente modCliente = new ModuloCliente();
	static ModuloEstoque modEstoque = new ModuloEstoque(modProduto);
	
	public static void main(String[] args) {		
		
		// instanciar uma classe (classe objeto = new classe())
//		NotaAluno notaAluno = new NotaAluno();
//		//notaAluno.nome = "marcelo";
//		notaAluno.nota1 = 6f;		
//		notaAluno.nota2 = 7f;		
//		notaAluno.mostrarMedia();
//		notaAluno.mostrarResultado();
				
		// outro objeto
//		NotaAluno notaAluno2 = new NotaAluno();
//		notaAluno2.nome = "pedro";
//		notaAluno2.nota1 = 5f;
//		notaAluno2.nota2 = 3f;		
//		notaAluno2.mostrarMedia();
//		notaAluno2.mostrarResultado();
//		
//		NotaAluno notaAluno3 = new NotaAluno();
//		notaAluno3.nome = "MARIA";
//		notaAluno3.nota1 = 10f;
//		notaAluno3.nota2 = 5f;		
//		notaAluno3.mostrarMedia();
//		notaAluno3.mostrarResultado();
		
		// ################
		
//		Calculadora calculadora = new Calculadora(); // instanciar.
//		calculadora.mostrarUltimaOperacao();
//		System.out.println("CALCULADORA ");
//		System.out.println("Digite o primeiro valor: ");
//		float v1 = TECLADO.nextFloat();
//		System.out.println("Digite o segundo valor: ");
//		float v2 = TECLADO.nextFloat();
//		float soma = calculadora.somar(v1, v2);
//		System.out.println("resultado soma 1 = " + soma);
//		calculadora.mostrarUltimaOperacao();
//		
//		Calculadora calculadora2 = new Calculadora(); // instanciar.
//		calculadora2.mostrarUltimosValores();
//		float subtrair = calculadora2.subtrair(10f, 5f);
//		System.out.println("resultado subtrair 2 = " + subtrair);
		
		// ###################
		
//		Produto p1 = new Produto();
//		p1.preco = 101f;
//		p1.totalEstoque = 10;
//		float precoDesconto =  p1.calcularPrecoDesconto();
//		System.out.println("Preço desconto 1 = " + precoDesconto);
//		boolean ePrecoMaior1 =  p1.ePrecoMaior100();
//		if(ePrecoMaior1 == true) {
//			System.out.println("Preço é maior que 100");
//		}else {
//			System.out.println("Preço NÃO é maior que 100");
//		}
//		p1.temEstoque1();
//		
//		Produto p2 = new Produto();
//		p2.nome = "tv";
//		p2.preco = 200f;
//		p2.totalEstoque = 0;
//		float precoDesconto2 =  p2.calcularPrecoDesconto();
//		System.out.println("Preço desconto 2 = " + precoDesconto2);
//		p2.temEstoque1();
		
		// ###################
		
//		NotaFiscal nf1 = new NotaFiscal();
//		nf1.nome1 = "tv";
//		nf1.nome2 = "som";
//		nf1.nome3 = "games";
//		nf1.nome4 = "geladeira";
//		nf1.nome5 = "fogão";
//		nf1.preco1 = 30;
//		nf1.preco2 = 40;
//		nf1.preco3 = 50;
//		nf1.preco4 = 60;
//		nf1.preco5 = 70;
//		nf1.totalNota();
//		nf1.relatorio();
//		
//		NotaFiscal nf2 = new NotaFiscal();
//		System.out.println("Digite o nome do item 1");
//		String item1 = TECLADO.next();
//		System.out.println("Digite o preco do item 1: " + item1);
//		float preco1 = TECLADO.nextFloat();
//		
//		System.out.println("Digite o nome do item 2");
//		String item2 = TECLADO.next();
//		System.out.println("Digite o preco do item 2: " + item2);
//		float preco2 = TECLADO.nextFloat();
//		
//		System.out.println("Digite o nome do item 3");
//		String item3 = TECLADO.next();
//		System.out.println("Digite o preco do item 3: " + item3);
//		float preco3 = TECLADO.nextFloat();
//		
//		nf2.nome1 = item1;
//		nf2.nome2 = item2;
//		nf2.nome3 = item3;
//		nf2.preco1 = preco1;
//		nf2.preco2 = preco2;
//		nf2.preco3 = preco3;
//		nf2.relatorio();
//		nf2.totalNota();
//				
//		
//		for(;;) { // LACO INFINITO
//			System.out.println("digite o nome do produto: ");
//			String nome = TECLADO.next();
//			Produto prod1 = new Produto();
//			prod1.nome = nome;
//			System.out.println("Digite SAIR para sair do sistema");
//			String opcao = TECLADO.next();
//			if(opcao.equals("SAIR")) {
//				break;
//			}
//			
//		}
		
//		Carro carro1 = new Carro();
//		System.out.println("Digite o nome do carro ");
//		carro1.nome = TECLADO.next();
//		System.out.println("Digite a marca do carro ");
//		carro1.marca = TECLADO.next();
//		System.out.println("Digite a potencia do carro ");
//		carro1.potencia = TECLADO.nextInt();
//		System.out.println("O carro está andando [sim ou nao] ?");
//		String situacaoCarro = TECLADO.next();
//		if(situacaoCarro.equals("sim")) {
//			carro1.estaParado = false;
//		}else {
//			carro1.estaParado = true;
//		}
//		carro1.eCarroPopular();
//		carro1.situacaoCarro();
//		
//		Carro carro2 = new Carro(); // CRINDO UM NOVO CARRO
//		System.out.println("Digite o nome do carro ");
//		carro2.nome = TECLADO.next();
//		System.out.println("Digite a marca do carro ");
//		carro2.marca = TECLADO.next();
//		System.out.println("Digite a potencia do carro ");
//		carro2.potencia = TECLADO.nextInt();
//		System.out.println("O carro está andando [sim ou nao] ?");
//		String situacaoCarro2 = TECLADO.next();
//		if(situacaoCarro2.equals("sim")) {
//			carro2.estaParado = false;
//		}else {
//			carro2.estaParado = true;
//		}
//		carro2.eCarroPopular();
//		carro2.situacaoCarro();		
//		Bicicleta caloi = new Bicicleta(1,5);		
		//caloi.acelerar();
		//caloi.imprimirEstado();
		
		// INICIANDO PROJETO PRÁTICO
	
		for(;;) {
			System.out.println("PRINCIPAL");
			System.out.println("1  MÓDULO PRODUTO");
			System.out.println("2  MÓDULO CLIENTE");
			System.out.println("3  MÓDULO ESTOQUE");
			System.out.println("4  MÓDULO VENDA");
			System.out.println("5  SAIR");
			String op = TECLADO.next();
			if(op.equals(MODULO_PRODUTO)) {
				processarModuloProduto();
			}else if(op.equals(MODULO_CLIENTE)) {
				processarModuloCliente();
			}
			else if(op.equals(MODULO_ESTOQUE)) {
				processarModuloEstoque();
			}
			else if(op.equals(MODULO_VENDA)) {
				System.out.println("EM DESENVOLVIMENTO");
			}
			else if(op.equals(SAIR)) {
				System.out.println("ENCERRANDO O PROGRAMA");
				System.exit(1);
			}else {
				System.out.println("DIGITE UMA OPÇÃO VÁLIDA");
			}
		}
	}

	private static void processarModuloEstoque() {
		System.out.println("MÓDULO ESTOQUE");
		System.out.println("1  Cadastro de estoque");
		System.out.println("2  Relatório de estoque ");
		System.out.println("3  Busca no estoque ");
		System.out.println("4  Atualização de estoque");
		System.out.println("9  voltar");
		String op = TECLADO.next();

		if(op.equals("1")) {
			System.out.println("Digite o código do produto");
			int codigo = TECLADO.nextInt();
			System.out.println("Digite a quantidade de itens do produto");
			int quantidade = TECLADO.nextInt();
			boolean resultado =  modEstoque.cadastarEstoque(codigo, quantidade);
			if(resultado == true) {
				System.out.println("Produto cadastro com sucesso no estoque");
			}else {
				System.out.println("Erro ao salvar no estoque. REfaça a operação");
			}
		}if(op.equals("2")) {
			modEstoque.listarEstoque();
		}if(op.equals("3")) {
			System.out.println("Digite o codigo do produto ");
			int codigo = TECLADO.nextInt(); 
			int quantidade = modEstoque.buscarProduto(codigo);
			if(quantidade < 0) {
				System.out.println("Produto não existe no sistema");				
			}else {
				System.out.println("Produto com código: " + codigo + 
						" tem " + quantidade + " no estoque.");
			}
		}if(op.equals("4")) {
			System.out.println("Digite o codigo do produto ");
			int codigo = TECLADO.nextInt();
			System.out.println("Digite a quantidade comprada");
			int quantidade = TECLADO.nextInt();
			modEstoque.atualizarEstoque(codigo, quantidade);			
		}
		
	}

	private static void processarModuloCliente() {
		System.out.println("MÓDULO CLIENTE");
		System.out.println("1  Cadastro de Cliente");
		System.out.println("2  Relatório de Cliente ");
		System.out.println("3  Busca de Cliente ");
		System.out.println("4  Remoção de Cliente");
		System.out.println("9  voltar");
		String op = TECLADO.next();
		if(op.equals("1")) {
			System.out.println("Deseja cadastrar "
					+ "cliente fisico [1] ou cliente juridico [2]");
			String tipoCliente = TECLADO.next();
			Cliente cliente;
			if(tipoCliente.equals("1")) {// cliente fisico
				cliente = new ClienteFisica();
				System.out.println("Digite o CPF "
						+ "do cliente");
				String cpf = TECLADO.next();
				ClienteFisica cf = (ClienteFisica) cliente;
				cf.setCpf(cpf);
			}
			else if(tipoCliente.equals("2")) {
				cliente = new ClienteJuridico();
				System.out.println("Digite o CNPJ "
						+ "do cliente");
				String cnpj = TECLADO.next();
				ClienteJuridico cj = (ClienteJuridico)cliente;
				cj.setCnpj(cnpj);
			}else {
				System.out.println("cliente invalido");
				return;
			}
			System.out.println("Digite o nome do cliente");
			String nome = TECLADO.next();			
			System.out.println("Digite o email do cliente");
			String email = TECLADO.next();
			System.out.println("Digite o endereco do cliente");
			String endereco = TECLADO.next();
						
			cliente.setEmail(email);
			cliente.setNome(nome);
			cliente.setEndereco(endereco);
			
			boolean resultado =  modCliente.salvarCliente(cliente);
			if(resultado == true) {
				System.out.println("Cliente salvo com sucesso");
			}else {
				System.out.println("Cliente não salvo :(");
			}
			
		}if(op.equals("2")) {			
			modCliente.gerarRelatorio();
		}
		if(op.equals("3")) {			
			System.out.println("Busca de Cliente");
			System.out.println("Digite o nome do cliente: ");
			String cpf_cnpj = TECLADO.next();
			
			Cliente cliente = modCliente.buscarCliente(cpf_cnpj);
			if(cliente == null) {
				System.out.println("Cliente não encontrado");
			}else {
				System.out.println("Cliente encontrado");
				System.out.println("Nome: " + cliente.getNome());
			}
		}
		if(op.equals("4")) {			
			System.out.println("Remoção de Cliente");
			System.out.println("Digite o nome do cliente: ");
			String cpf_cnpj = TECLADO.next();
			
			boolean resutaldo = modCliente.removerCliente(cpf_cnpj);
			if(resutaldo == false) {
				System.out.println("Cliente não encontrado");
			}else {
				System.out.println("Cliente removido com sucesso");				
			}
		}	
	}

	// gerencia as operacoes de produto
	private static void processarModuloProduto() {
		System.out.println("MÓDULO PRODUTO");
		System.out.println("1.1  Cadastro de Produto Físico");
		System.out.println("1.2  Cadastro de Produto Digital");
		System.out.println("2  Relatório de Produtos ");
		System.out.println("3  Busca de Produtos ");
		System.out.println("4  Remoção de Produtos");
		System.out.println("9  voltar");
		String op = TECLADO.next();		
		
		if(op.equals("1.1")) {
			System.out.println("Digite o nome do produto");
			String nome = TECLADO.next();
			System.out.println("Digite o preco do produto");
			float preco = TECLADO.nextFloat();
			System.out.println("Digite o peso do produto");
			long peso = TECLADO.nextLong();
			System.out.println("Digite o tamanho do produto");
			long tamanho = TECLADO.nextLong();
			System.out.println("Digite o desconto do produto");
			long desconto = TECLADO.nextLong();
			ProdutoFisico pf = new ProdutoFisico(nome, preco);
			pf.setTamanho(tamanho);
			pf.setDesconto(desconto);
			pf.setPeso(peso);
			boolean resultado =  modProduto
					.salvarProduto(pf);
			if(resultado == true) {
				System.out.println("Produto Fisico salvo com sucesso");
			}else {
				System.out.println("Produto não salvo :(");
			}
			
		}if(op.equals("1.2")) {
			System.out.println("Digite o nome do produto");
			String nome = TECLADO.next();
			System.out.println("Digite o preco do produto");
			float preco = TECLADO.nextFloat();
			System.out.println("Digite o tamanho do programa");
			long peso = TECLADO.nextLong();
			System.out.println("Digite o desconto do produto");
			long desconto = TECLADO.nextLong();
			
			ProdutoDigital pd = new ProdutoDigital(nome, preco);
			pd.setTamanhoPrograma(peso);
			pd.setDesconto(desconto);
			boolean resultado =  modProduto
					.salvarProduto(pd);
			if(resultado == true) {
				System.out.println("Produto Digital salvo com sucesso");
			}else {
				System.out.println("Produto não salvo :(");
			}
			
		}else if(op.equals("2")) {
			System.out.println("Relatório de Produtos");
			for(Produto produto : modProduto.getListaProduto()) {
				if(produto instanceof ProdutoFisico) {
					System.out.println("Produto Físico");
				}
				if(produto instanceof ProdutoDigital) {
					System.out.println("Produto Digital");
				}
				System.out.println("Código: " + produto.getCodigo());
				System.out.println("Nome: " + produto.getNome());
				System.out.println("Preço: " + produto.getPreco());
				System.out.println("---------------------------");
			}
		}
		else if(op.equals("3")) {
			System.out.println("Busca de Produtos");
			System.out.println("Digite o código do produto: ");
			Integer codigo = TECLADO.nextInt();
			Produto produto = modProduto.buscarProduto(codigo);
			if(produto == null) {
				System.out.println("Produto não encontrado");
			}else {
				System.out.println("Produto Encontrado");
				System.out.println("Nome: " + produto.getNome());
				System.out.println("Preço: " + produto.getPreco());
				System.out.println("---------------------------");
			}
		}else if(op.equals("4")) {
			System.out.println("Remoção de Produtos");
			System.out.println("Digite o código do produto: ");
			Integer codigo = TECLADO.nextInt();
			boolean resultado = modProduto.removerProduto(codigo);
			if(resultado) {
				System.out.println("Produto removido com sucesso");
			}else {
				System.out.println("Produto não removido");
			}
		}
		
	}

}
