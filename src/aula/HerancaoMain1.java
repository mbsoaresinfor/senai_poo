package aula;

public class HerancaoMain1 {

	public static void main(String[] args) {

		ClienteFisica cf = new ClienteFisica();
		cf.setCpf("814");
		cf.setEmail("email");  // herdado
		cf.setNome("cliente fisico"); // herdado
		cf.setRg("5555");
		cf.setEndereco("rua a"); // herdado
		
		ClienteJuridico cj = new ClienteJuridico();
		cj.setCnpj("66899");
		cj.setEmail("email2"); // herdado
		cj.setEndereco("rua "); // herdado
		cj.setNome("empresa");// herdado
		cj.setInscricaoEstadual("sdksdklsd");
		
		System.out.println("pessoa fisica: "
		+ cf.getNome());
		
		System.out.println("pessoa juridica: "
		+ cj.getNome());
		

	}

}
