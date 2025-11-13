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
		try {
			conta.sacar(50);
		} catch (SaldoInsuficienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void depositar(ContaBancaria conta) {
		conta.depositar(40);
	}

}
