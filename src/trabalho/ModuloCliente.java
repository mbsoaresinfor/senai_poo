
package trabalho;

import java.util.ArrayList;
import java.util.Scanner;

import aula1.Cliente;
import aula1.Endereco;



public class ModuloCliente {
	private Scanner teclado = new Scanner(System.in);
	
	private ArrayList<Cliente> lista =
			new ArrayList<Cliente>();
	
	public void cadastrar() {
		System.out.println("CADASTRO DE CLIENTE");		
		System.out.println("Digite cpf ");
		String  cpf = teclado.next();
		System.out.println("Digite nome ");
		String nome = teclado.next();
		System.out.println("Digite rua  ");
		String rua = teclado.next();
		
		if(nome.length() < 3 || nome.length() > 30) {
			System.out.println("Nome invalido");
			return;
		}
		
		Cliente clienteTestSeExiste = new Cliente();
		clienteTestSeExiste.setCpf(cpf);
		if(lista.contains(clienteTestSeExiste)) {
			System.out.println("Cliente com cpf "  + cpf + " já existe.");
					return;
		}
		
		Cliente cliente = new Cliente();
		cliente.setCpf(cpf);
		cliente.setNome(nome);
		Endereco end =new Endereco();
		end.setRua(rua);
		cliente.setEndereco(end);
	
		
		System.out.println("Cliente cadastrado com sucesso");
		
	}

	public void relatorio() {
		System.out.println("RELATÓRIO DE CLIENTES");
		for(Cliente cliente : lista) {
			System.out.println("Nome: " + cliente.getNome());
			System.out.println("cpf: " + cliente.getCpf());
			System.out.println("Rua : " + cliente.getEndereco().getRua());
			System.out.println("---------------------------------");
		}
	}

	public void buscar() {
		System.out.println("BUSCA DE CLIENTE");		
		System.out.println("Digite CPF do cliente: ");
		String cpf = teclado.next();
		
		boolean achou = false;
		for(Cliente cliente : lista) {
			if(cpf.equals(cliente.getCpf())) {
				System.out.println("Nome: " + cliente.getNome());
				System.out.println("cpf: " + cliente.getCpf());
				System.out.println("Rua : " + cliente.getEndereco().getRua());
				System.out.println("---------------------------------");
				achou = true;
			}
		}
		if(achou == false) {
			System.out.println("Cliente não localizado");			
		}
	}

	public void remocao() {
		System.out.println("REMOÇÃO DE PRODUTO");		
		System.out.println("Digite CPF do cliente: ");
		String cpf = teclado.next();
		
		
		boolean resultado = lista.removeIf(obj -> obj.getCnpj().equals(cpf));
		if(resultado) {
			System.out.println("Cliente removido com sucesso");
		}else {
			System.out.println("Cliente não localizado");
		}
	}
}
