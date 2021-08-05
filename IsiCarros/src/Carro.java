
public class Carro {
	// vamos apenas declarar as vari�veis que compoem o tipo CARRO
	String marca;
	String modelo;
	int ano;
	String cor;
	double preco;

	// agora tamb�m precisamos criar trechos de c�digo (subrotinas - m�todos)
	// para manipular, exibir, alterar essas vari�veis

	void exibirInfo() {
		System.out.println("Autom�vel: " + marca + " " + modelo);
		System.out.println("      Ano: " + ano);
		System.out.println("      Cor: " + cor);
		System.out.println("    Pre�o: " + preco);

	}

	void aplicarDesconto(double percentual) {
		preco -= preco * percentual / 100;
	}
	// agora quero uma funcionalidade que me retorne o valor de IPVA do carro,
	// baseado em seu pre�o

	double calcIpva() {
		double valoripva;
		if (ano < 2000) {
			valoripva = 0.0;
		} else {
			valoripva = preco * 0.02;
		}
		return valoripva;

	}
}