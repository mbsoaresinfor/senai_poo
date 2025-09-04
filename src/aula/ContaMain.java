package aula;

public class ContaMain {

	public static void main(String[] args) {
		Conta conta = new Conta();
		System.out.println("Saldo R$ " + conta.getSaldo());
		conta.sacar(50);
		System.out.println("Saldo R$ " + conta.getSaldo());
		conta.sacar(300);
		System.out.println("Saldo R$ " + conta.getSaldo());
		conta.setSaldo(500);
		System.out.println("Saldo R$ " + conta.getSaldo());
		
	}

}
