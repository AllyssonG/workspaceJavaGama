
public class Loja {
	public static void main(String[] args) {
		// Carro é meu novo tipo de dado
		// c1 e c2 são as "variáveis" deste novo tipo - chamados de Objetos
		Carro c1;
		Carro c2;

		c1 = new Carro(); // aqui reservamos memória para todas as variáveis
		c2 = new Carro();

		// vamos atribuir valores (forçando mesmo)
		c1.marca = "Pórxy";
		c1.modelo = "Kaineni";
		c1.ano = 2021;
		c1.cor = "Preto";
		c1.preco = 780000;

		c2.marca = "Xevrolé";
		c2.modelo = "Corça";
		c2.ano = 1997;
		c2.cor = "Prata meio gasto";
		c2.preco = 7500;

		/*
		 * // Vamos exibir o anúncio
		 * System.out.println("Automóvel: "+c1.marca+" "+c1.modelo);
		 * System.out.println("      Ano: "+c1.ano);
		 * System.out.println("      Cor: "+c1.cor);
		 * System.out.println("    Preço: R$ "+c1.preco +"\n"); System.out.println();
		 * System.out.println("Automóvel: "+c2.marca+" "+c2.modelo);
		 * System.out.println("      Ano: "+c2.ano);
		 * System.out.println("      Cor: "+c2.cor);
		 * System.out.println("    Preço: R$ "+c2.preco);
		 */
		c1.exibirInfo();
		System.out.println();
		c2.exibirInfo();

		c1.aplicarDesconto(10.0);
		c2.aplicarDesconto(5.0);

		System.out.println("-------------------");
		c1.exibirInfo();
		c2.exibirInfo();
		
		double ipvaC1 = c1.calcIpva();
		double ipvaC2 = c2.calcIpva();
		
		System.out.println("Valor do ipva do "+c1.modelo+" = "+ipvaC1);
		System.out.println("Valor do ipva do "+c2.modelo+" = "+ipvaC2);
	} 
}
