/*aqui vamos fazer um exemplo de encapsulamento
 * 
 * tentem associar encapsulamento = blindagem
 */
public class Conta {
	private int numeroConta;
	private int digito;
	private String titular;
	private String cpf;
	private double saldo;

	/*
	 * public void setNumeroConta(int numeroConta) { //aqui eu poderia fazer a
	 * rotina de validação que eu quisesse this.numeroConta = numeroConta; } public
	 * int getNumeroConta() { return numeroConta; }
	 */
	public String exibir() {
		return "Conta " + numeroConta + "/" + digito + "\n" + "      Titular:  " + titular + " (" + cpf + ")" + "\n"
				+ "      Saldo  : R$ " + saldo;
	}

	public void depositar(double valor) {
		saldo = saldo + valor;
	}

	public boolean sacar(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getDigito() {
		return digito;
	}

	public void setDigito(int digito) {
		this.digito = digito;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
