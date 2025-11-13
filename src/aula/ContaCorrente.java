package aula;

public class ContaCorrente 
	implements ContaBancaria{

	@Override
	public void depositar(float valor) {
		System.out.println("depositando " + valor +
				" na conta corrente");
	}

	@Override
	public void sacar(int valor) throws SaldoInsuficienteException {
		System.out.println("sacando " + valor +
				" na conta corrente");
		
	}

}
