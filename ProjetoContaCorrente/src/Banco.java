import java.util.Scanner;

public class Banco {
	public static void main(String[] args) {
		//qual o intuito dessa aplica��o ?
		//1- declarar nossas vari�veis do tipo "Conta"
		//2- vamos fazer um menu pra manipular 1 conta s�?
		//depositar, sacar e exibir as infos?
		//3- toda intera��o com o usu�rio (print e scanner) fica por aqui
		
		Scanner teclado = new Scanner(System.in);
		int opcao;
		double valor;
		
		Conta c1;
		c1=new Conta();
		c1.setNumeroConta(12345);
		c1.setDigito(6);
		c1.setTitular("Professor Isidro");
		c1.setCpf("123.456.789-00");
		c1.setSaldo(200.00);
		
		//agora vem meu menu!!!
		do {
			System.out.println("Bem vindo ao IsiTa� - Seu banco na NET");
			System.out.println("Digite 1-Info / 2-Dep�sito / 3-Saque / 0-Encerrar");
			opcao = teclado.nextInt();
			switch (opcao) {
			case 1:
				System.out.println(c1.exibir());
				break;
			case 2:
				System.out.println("[DEPOSITO] Digite o Valor: ");
				valor=teclado.nextDouble();
				c1.depositar(valor);
				System.out.println("Dep�sito Realizado");
				break;
			case 3:
				System.out.println("[SAQUE]    Digite o Valor: ");
				valor=teclado.nextDouble();
				if(c1.sacar(valor)) {
					System.out.println("       Saque Autorizado");
				}
				else {
					System.out.println("       Saldo Insuficiente");
				}
				break;
			case 0:
				System.out.println("---->Obrigado pela Prefer�ncia!");
				break;
			default:
				System.out.println("ERRO: Op��o Inv�lida");
				//break; n�o precisa, mas funciona do msm jeito
			}
			
		} while (opcao !=0);
		
		teclado.close();
	}

}
