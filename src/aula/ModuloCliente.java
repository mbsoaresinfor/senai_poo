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
		if(cliente.getEndereco().length() < 30) {
			System.out.println("endere deve ter menos de 30 caracteres");
			return false;
		}
		
		listaCliente.add(cliente);
		return true;
	}
	
}
