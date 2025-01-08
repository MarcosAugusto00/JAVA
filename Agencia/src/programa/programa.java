package programa;
import java.util.Locale;
import java.util.Scanner;

import operacional.Account;

public class programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		Account conta;
		
		System.out.print("Entre com o numero da conta: ");
		int numero = teclado.nextInt();
		
		System.out.print("Entre com o nome do titular: ");
		teclado.nextLine();
		String titular = teclado.nextLine();
		
		System.out.print("Vai haver algum deposito inical? [S/N] ");
		char resp = teclado.next().charAt(0);
		
		if(resp == 'S') {
			System.out.print("Digite o valor do deposito incial: ");
			double inicialDeposito = teclado.nextDouble();
			conta = new Account(numero, titular, inicialDeposito); 
		
		}else {
			conta = new Account(numero, titular);
		}
		System.out.println("");
		System.out.println("Conta:");
		System.out.println(conta);
		
		System.out.print("Digite o valor do deposito: ");
		double deposito = teclado.nextDouble();
		conta.deposito(deposito);
		System.out.print("Digite o valor do seu saque: ");
		double saque = teclado.nextDouble();
		conta.saque(saque);
		System.out.println(conta);
		
		teclado.close();
	}

}