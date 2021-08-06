
public class ContaBancaria {
	int numConta, digito;
	String nomeTitular, cpf;
	double saldo;

	void exibirInfo() {
		System.out.println("Número da conta: " + numConta + "/" + digito);
		System.out.println("        Titular: " + nomeTitular);
		System.out.println("            CPF: " + cpf);
		System.out.printf("           Saldo: R$ %.2f\n", saldo, "\n");
	}
	
	void depositar(double valor) {
		saldo += valor;
	}

	void saque(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			System.out.println("Saque efetuado da conta " + numConta + "/" + digito);
		}
		else {
			System.out.println("Saldo Insuficiente");
		}
	}
}
