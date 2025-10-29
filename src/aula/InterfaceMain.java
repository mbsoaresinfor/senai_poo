package aula;

public class InterfaceMain {

	public static void main(String[] args) {

		ContaBancaria cc = new ContaCorrente();
		ContaBancaria cp = new ContaPoupanca();
		
		sacar(cc);
		depositar(cc);
		
		sacar(cp);
		depositar(cp);
	}
	
	public static void sacar(ContaBancaria conta) {
		conta.sacar(50);
	}
	
	public static void depositar(ContaBancaria conta) {
		conta.depositar(40);
	}

}
