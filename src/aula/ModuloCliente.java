package aula;

import java.util.ArrayList;
import java.util.List;

public class ModuloCliente {

	private List<Cliente> listaCliente = new ArrayList<Cliente>();
	
	public boolean salvarCliente(Cliente cliente) {
		if(cliente == null) {
			return false;
		}
		
		if(cliente instanceof ClienteFisica) {
			//downcast
			ClienteFisica cf = (ClienteFisica) cliente;
			if(cf.getCpf().length() < 8) {
				System.out.println("CPF deve"
						+ " ter mais de 8 caracteres");
				return false;
			}
		}
		if(cliente instanceof ClienteJuridico) {
			// downcast
			ClienteJuridico cj = (ClienteJuridico) cliente;
			if(cj.getCnpj().length() < 11) {
				System.out.println("CNPJ deve"
						+ " ter mais de 11 caracteres");
				return false;
			}
		}
				
		if(cliente.getNome().length() < 3 
				|| cliente.getNome().length() > 50) {
			System.out.println("nome deve ter entre 3 a 50 cararacters");
			return false;
		}
		if(cliente.getEndereco().length() > 30) {
			System.out.println("endereço deve ter menos de 30 caracteres");
			return false;
		}
		
		listaCliente.add(cliente);
		return true;
	}

	public void gerarRelatorio() {
		System.out.println("Relatório de Clientes");
		for(Cliente cliente : listaCliente) {
			System.out.println("Nome: " + cliente.getNome());
			if(cliente instanceof ClienteFisica) {
				ClienteFisica cf = (ClienteFisica) cliente;
				System.out.println("CPF: " + cf.getCpf());
			}
			if(cliente instanceof ClienteJuridico) {
				ClienteJuridico cj = (ClienteJuridico) cliente;
				System.out.println("CNPJ: " + cj.getCnpj());
			}
			
			System.out.println("Endereço: " + cliente.getEndereco());			
			System.out.println("---------------------------");
		}		
	}
	
	public boolean removerCliente(String nome) {		
		return listaCliente
				.removeIf(obj -> obj.getNome()
						.equals(nome));
	}
	
	public Cliente buscarCliente(String nome) {
		for(Cliente cliente : listaCliente) {
			if(cliente.getNome().equals(nome)) {
				return cliente;
			}
		}
		return null;
	}
	
}
