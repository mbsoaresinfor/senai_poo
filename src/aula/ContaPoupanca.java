package aula;

public class ContaPoupanca
	implements ContaBancaria{

	@Override
	public void depositar(float valor) {
		System.out.println("depositando " + valor +
				" na conta poupanca");
		
	}

	@Override
	public void sacar(int valor) {
		System.out.println("sacando " + valor +
				" na conta poupanca");
		
	}

}
