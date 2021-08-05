
public class Carro {
	// vamos apenas declarar as variáveis que compoem o tipo CARRO
	String marca;
	String modelo;
	int ano;
	String cor;
	double preco;

	// agora também precisamos criar trechos de código (subrotinas - métodos)
	// para manipular, exibir, alterar essas variáveis

	void exibirInfo() {
		System.out.println("Automóvel: " + marca + " " + modelo);
		System.out.println("      Ano: " + ano);
		System.out.println("      Cor: " + cor);
		System.out.println("    Preço: " + preco);

	}

	void aplicarDesconto(double percentual) {
		preco -= preco * percentual / 100;
	}
	// agora quero uma funcionalidade que me retorne o valor de IPVA do carro,
	// baseado em seu preço

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