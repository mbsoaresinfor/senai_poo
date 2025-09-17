package aula;

import java.util.ArrayList;
import java.util.List;

public class ModuloCliente {

	private List<Cliente> listaCliente = new ArrayList<Cliente>();
	
	public boolean salvarCliente(Cliente cliente) {
		if(cliente == null) {
			return false;
		}
		if(cliente.getCnpj_cpf().length() < 8) {
			System.out.println("cpf deve ter mais de 8 caracteres");
			return false;
		}
		if(cliente.getNome().length() < 3 
				|| cliente.getNome().length() > 50) {
			System.out.println("nome deve ter entre 3 a 50 cararacters");
			return false;
		}
		if(cliente.getEndereco().length() > 30) {
			System.out.println("endere deve ter menos de 30 caracteres");
			return false;
		}
		
		listaCliente.add(cliente);
		return true;
	}

	public void gerarRelatorio() {
		System.out.println("Relatório de Clientes");
		for(Cliente cliente : listaCliente) {
			System.out.println("Nome: " + cliente.getNome());
			System.out.println("Cpf/Cnpj: " + cliente.getCnpj_cpf());
			System.out.println("Endereço: " + cliente.getEndereco());			
			System.out.println("---------------------------");
		}		
	}
	
	public boolean removerCliente(String cpf_cnpj) {
		Cliente cliente = new Cliente();
		cliente.setCnpj_cpf(cpf_cnpj); // removendo pelo equals
		return listaCliente.remove(cliente);
	}
	
	public Cliente buscarCliente(String cpf_cnpj) {
		for(Cliente cliente : listaCliente) {
			if(cliente.getCnpj_cpf().equals(cpf_cnpj)) {
				return cliente;
			}
		}
		return null;
	}
	
}
