
public class Banco {
	public static void main(String[] args) {
		ContaBancaria c1, c2, c3;
		
		
		c1 = new ContaBancaria();
		c2 = new ContaBancaria();
		c3 = new ContaBancaria();
		
		c1.numConta = 12345;
		c1.digito = 6;
		c1.nomeTitular = "Professor Isidro";
		c1.cpf = "246813579-00";
		c1.saldo = 200.00;
		
		c2.numConta = 54321;
		c2.digito = 5;
		c2.nomeTitular = "TesteUser";
		c2.cpf = "123456789-00";
		c2.saldo = 10000.00;
		
		c3.numConta = 24680;
		c3.digito = 4;
		c3.nomeTitular = "Usuário";
		c3.cpf = "987654321-00";
		c3.saldo = 15000.00;
		
		c1.exibirInfo();
		System.out.println("-----------------------");
		c1.depositar(50.00);
		c1.exibirInfo();
		System.out.println("-----------------------");
		c1.saque(150);
		c1.exibirInfo();
		System.out.println("-----------------------");
		c1.saque(230.00);
		c1.exibirInfo();
	}
}
